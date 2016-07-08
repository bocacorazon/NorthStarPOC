package com.tr.microsvcs.dw;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

import java.util.List;

public class Poc1Configuration extends Configuration {

    // TODO: implement service configuration
    @NotEmpty
    private List<String> esNodes;

    @NotEmpty
    private String clusterName;

    @NotEmpty
    private String index;

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
}
