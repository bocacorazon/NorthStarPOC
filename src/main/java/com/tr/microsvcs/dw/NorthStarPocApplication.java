package com.tr.microsvcs.dw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tr.microsvcs.dw.dao.Impl.SpreadsheetDaoImpl;
import com.tr.microsvcs.dw.dao.SpreadsheetDao;
import com.tr.microsvcs.dw.health.EsHealthCheck;
import com.tr.microsvcs.dw.managed.ManagedEsClient;
import com.tr.microsvcs.dw.resources.SpreadsheetResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class NorthStarPocApplication extends Application<NorthStarPocConfiguration> {

    public static void main(final String[] args) throws Exception {
        new NorthStarPocApplication().run(args);
    }

    @Override
    public String getName() {
        return "NorthStar Poc";
    }

    @Override
    public void initialize(final Bootstrap<NorthStarPocConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<NorthStarPocConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(NorthStarPocConfiguration configuration) {
                return configuration.swaggerBundleConfiguration;
            }
        });
    }

    @Override
    public void run(final NorthStarPocConfiguration configuration,
                    final Environment environment) {

        final ManagedEsClient managedEsClient = new ManagedEsClient(configuration);
        environment.lifecycle().manage(managedEsClient);

        final SpreadsheetDao ssDao = new SpreadsheetDaoImpl(managedEsClient.getClient(), configuration.getIndex());
        final SpreadsheetResource ssResource = new SpreadsheetResource(ssDao, configuration.getDefaultMaxResults());
        environment.jersey().register(ssResource);

        final EsHealthCheck healthCheck = new EsHealthCheck(managedEsClient.getClient());
        environment.healthChecks().register("ElasticSearch Cluster", healthCheck);
        environment.jersey().register(healthCheck);
    }

}
