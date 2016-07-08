package com.tr.microsvcs.dw;

import com.tr.microsvcs.dw.health.EsHealthCheck;
import com.tr.microsvcs.dw.managed.ManagedEsClient;
import com.tr.microsvcs.dw.resources.Poc1Resource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Poc1Application extends Application<Poc1Configuration> {

    public static void main(final String[] args) throws Exception {
        new Poc1Application().run(args);
    }

    @Override
    public String getName() {
        return "poc1";
    }

    @Override
    public void initialize(final Bootstrap<Poc1Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Poc1Configuration configuration,
                    final Environment environment) {

        final ManagedEsClient managedEsClient = new ManagedEsClient(configuration);
        environment.lifecycle().manage(managedEsClient);

        final Poc1Resource resource = new Poc1Resource(configuration.getEsNodes());
        environment.jersey().register(resource);

        final EsHealthCheck healthCheck = new EsHealthCheck(managedEsClient.getClient());
        environment.healthChecks().register("ElasticSearch Cluster", healthCheck);
        environment.jersey().register(healthCheck);
    }

}
