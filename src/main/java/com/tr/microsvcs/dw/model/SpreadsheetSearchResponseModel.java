package com.tr.microsvcs.dw.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by u6034037 on 7/11/2016.
 */
public class SpreadsheetSearchResponseModel {

    public int numberOfHits;

    @JsonProperty("type")
    public String ssSubType;

    public SpreadsheetSearchResponseModel (int numberOfHits, String ssSubType) {
        this.numberOfHits = numberOfHits;
        this.ssSubType = ssSubType;
    }

    public List<SpreadsheetSearchResponseItemModel> results;

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public void setNumberOfHits(int numberOfHits) {
        this.numberOfHits = numberOfHits;
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
