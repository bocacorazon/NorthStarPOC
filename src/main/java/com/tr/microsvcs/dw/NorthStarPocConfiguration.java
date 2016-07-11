package com.tr.microsvcs.dw;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

import java.util.List;

public class NorthStarPocConfiguration extends Configuration {

    // TODO: implement service configuration
    @NotEmpty
    private List<String> esNodes;

    @NotEmpty
    private String clusterName;

    @NotEmpty
    private String index;

    private int defaultMaxResults;

    @JsonProperty
    public List<String> getEsNodes() {
        return esNodes;
    }

    @JsonProperty
    public void setEsNodes(List<String> esNodes) {
        this.esNodes = esNodes;
    }

    @JsonProperty
    public String getClusterName() {
        return clusterName;
    }

    @JsonProperty
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @JsonProperty
    public String getIndex() {
        return index;
    }

    @JsonProperty
    public void setIndex(String index) {
        this.index = index;
    }

    @JsonProperty
    public int getDefaultMaxResults() {
        return defaultMaxResults;
    }

    @JsonProperty
    public void setDefaultMaxResults(int defaultMaxResults) {
        this.defaultMaxResults = defaultMaxResults;
    }
}
