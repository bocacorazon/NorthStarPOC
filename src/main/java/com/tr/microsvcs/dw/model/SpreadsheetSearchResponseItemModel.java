package com.tr.microsvcs.dw.model;

import java.util.List;

/**
 * Created by u6034037 on 7/11/2016.
 */
public class SpreadsheetSearchResponseItemModel {

    public SpreadsheetSearchResponseItemModel(long id, String name, String ssSubType) {
        this.id = id;
        this.name = name;
        this.ssSubType = ssSubType;
    }

    public long id;
    public String name;
    public String ssSubType;
    public List<String> highlights;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsSubType() {
        return ssSubType;
    }

    public void setSsSubType(String ssSubType) {
        this.ssSubType = ssSubType;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

}
