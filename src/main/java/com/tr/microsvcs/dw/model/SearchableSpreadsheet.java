package com.tr.microsvcs.dw.model;

import java.util.Date;

public class SearchableSpreadsheet {

    private long spreadsheetId;
    private String spreadsheetType;
    private long firmId;

    private String client;
    private String user;
    private long version;
    private String name;
    private String nameEng;
    private String nameSimple;
    private String createdBy;
    private Date created;
    private String lastModifiedBy;
    private Date modified;

    //[Attachment(name = "file")]
    private String file;
    private long fileSize;
    private String keywords;
    private String fileName;
    private String contentHash;
    private String description;

    public long getSpreadsheetId() {
        return spreadsheetId;
    }

    public void setSpreadsheetId(long spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
    }

    public String getSpreadsheetType() {
        return spreadsheetType;
    }

    public void setSpreadsheetType(String spreadsheetType) {
        this.spreadsheetType = spreadsheetType;
    }

    public long getFirmId() {
        return firmId;
    }

    public void setFirmId(long firmId) {
        this.firmId = firmId;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getNameSimple() {
        return nameSimple;
    }

    public void setNameSimple(String nameSimple) {
        this.nameSimple = nameSimple;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentHash() {
        return contentHash;
    }

    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
