package com.tr.microsvcs.dw.util;

import com.google.common.net.HostAndPort;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcos on 7/8/16.
 */
public class TransportAddressHelper {
    private static final int DEFAULT_PORT = 9300;

    public static TransportAddress fromHostAndPort(final String hp) {
        HostAndPort hostAndPort = HostAndPort.fromString(hp);
        InetSocketAddress address = new InetSocketAddress(hostAndPort.getHostText(), hostAndPort.getPortOrDefault(DEFAULT_PORT));
        return new InetSocketTransportAddress(address);
    }

    public static TransportAddress[] fromHostAndPorts(final List<String> hostAndPorts) {
        if (hostAndPorts == null) {
            return new TransportAddress[0];
        } else {
            TransportAddress[] transportAddresses = new TransportAddress[hostAndPorts.size()];

            for (int i = 0; i < hostAndPorts.size(); i++) {
                transportAddresses[i] = fromHostAndPort(hostAndPorts.get(i));
            }

            return transportAddresses;
        }
    }
}
