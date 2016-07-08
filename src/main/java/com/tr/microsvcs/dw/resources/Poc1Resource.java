package com.tr.microsvcs.dw.resources;

import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;
import com.tr.microsvcs.dw.api.MyEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by marcos on 7/7/16.
 */
@Path("/one")
@Produces(MediaType.APPLICATION_JSON)
public class Poc1Resource {
    private final AtomicLong counter;
    private List<String> nodes;

    public Poc1Resource(List<String> nodes) {
        this.counter = new AtomicLong();
        this.nodes = nodes;
    }

    @GET
    @Timed
    public MyEntity get(@QueryParam("name") Optional<String> name) {
        return new MyEntity(counter.incrementAndGet(), "Hello " + name.or("Stranger") + "!");
    }
}
