package com.tr.microsvcs.dw.health;

import com.codahale.metrics.health.HealthCheck;
import org.elasticsearch.action.admin.cluster.health.ClusterHealthResponse;
import org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus;
import org.elasticsearch.client.Client;
/**
 * Created by marcos on 7/7/16.
 */
public class EsHealthCheck extends HealthCheck {

    private Client client;

    public EsHealthCheck(Client client) {
        this.client = client;
    }

    @Override
    protected Result check() throws Exception {
        ClusterHealthResponse chr = client
                .admin()
                .cluster()
                .prepareHealth()
                .get();

        String status = "Last status: " + chr.getStatus().name();

        if (chr.getStatus() == ClusterHealthStatus.RED)
            return Result.unhealthy(status);

        return Result.healthy(status);
    }
}
