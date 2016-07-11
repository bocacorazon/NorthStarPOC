package com.tr.microsvcs.dw.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by u6034037 on 7/11/2016.
 */
public class SpreadsheetSearchResponseModel {
    public long hits;

    @JsonProperty("type")
    public String ssSubType;

    public List<SpreadsheetSearchResponseItemModel> results;

    public long getHits() {
        return hits;
    }

    public void setHits(long hits) {
        this.hits = hits;
    }

    public List<SpreadsheetSearchResponseItemModel> getResults() {
        return results;
    }

    public void setResults(List<SpreadsheetSearchResponseItemModel> results) {
        this.results = results;
    }

    public String getSsSubType() { return ssSubType; }

    public void setSsSubType(String ssSubType) { this.ssSubType = ssSubType; }
}
