package com.tr.microsvcs.dw.api;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by marcos on 7/7/16.
 */
public class MyEntity {

    private long id;

    private String content;

    public MyEntity() {
        // Jackson deserialization
    }

    public MyEntity(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
