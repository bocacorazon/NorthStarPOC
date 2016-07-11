package com.tr.microsvcs.dw.managed;

import com.tr.microsvcs.dw.NorthStarPocConfiguration;
import com.tr.microsvcs.dw.util.TransportAddressHelper;
import io.dropwizard.lifecycle.Managed;
import org.elasticsearch.action.admin.cluster.health.ClusterHealthRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;

/**
 * Created by marcos on 7/8/16.
 */
public class ManagedEsClient implements Managed {

    private Client client = null;
    private NorthStarPocConfiguration config;

    public ManagedEsClient(final NorthStarPocConfiguration config) {
        this.config = config;
        Settings settings = Settings.settingsBuilder()
                .put("cluster.name", config.getClusterName())
                .build();
        final TransportAddress[] addresses = TransportAddressHelper.fromHostAndPorts(config.getEsNodes());
        this.client = TransportClient.builder()
                .settings(settings)
                .build()
                .addTransportAddresses(addresses);
        init();
    }

    public void init() {
        this.client
                .admin()
                .cluster()
                .health(new ClusterHealthRequest(config.getIndex()).waitForYellowStatus())
                .actionGet();
    }

    @Override
    public void start() throws Exception {
    }

    @Override
    public void stop() throws Exception {
        if (null != client) {
            client.close();
        }
    }

    public Client getClient() {
        return client;
    }
}
