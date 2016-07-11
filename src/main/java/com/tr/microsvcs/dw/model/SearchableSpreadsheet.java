package com.tr.microsvcs.dw.model;

import java.util.Date;

public class SearchableSpreadsheet {

    private long SpreadsheetId;
    private String SpreadsheetType;
    private long FirmId;

    private String Client;
    private String User;
    private long Version;
    private String Name;
    private String NameEng;
    private String NameSimple;
    private String CreatedBy;
    private Date Created;
    private String LastModifiedBy;
    private Date Modified;

    //[Attachment(Name = "file")]
    private String File;
    private long FileSize;
    private String Keywords;
    private String FileName;
    private String ContentHash;
    private String Description;

    public long getSpreadsheetId() {
        return SpreadsheetId;
    }

    public void setSpreadsheetId(long spreadsheetId) {
        SpreadsheetId = spreadsheetId;
    }

    public String getSpreadsheetType() {
        return SpreadsheetType;
    }

    public void setSpreadsheetType(String spreadsheetType) {
        SpreadsheetType = spreadsheetType;
    }

    public long getFirmId() {
        return FirmId;
    }

    public void setFirmId(long firmId) {
        FirmId = firmId;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public long getVersion() {
        return Version;
    }

    public void setVersion(long version) {
        Version = version;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNameEng() {
        return NameEng;
    }

    public void setNameEng(String nameEng) {
        NameEng = nameEng;
    }

    public String getNameSimple() {
        return NameSimple;
    }

    public void setNameSimple(String nameSimple) {
        NameSimple = nameSimple;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public Date getCreated() {
        return Created;
    }

    public void setCreated(Date created) {
        Created = created;
    }

    public String getLastModifiedBy() {
        return LastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        LastModifiedBy = lastModifiedBy;
    }

    public Date getModified() {
        return Modified;
    }

    public void setModified(Date modified) {
        Modified = modified;
    }

    public String getFile() {
        return File;
    }

    public void setFile(String file) {
        File = file;
    }

    public long getFileSize() {
        return FileSize;
    }

    public void setFileSize(long fileSize) {
        FileSize = fileSize;
    }

    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String keywords) {
        Keywords = keywords;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getContentHash() {
        return ContentHash;
    }

    public void setContentHash(String contentHash) {
        ContentHash = contentHash;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
