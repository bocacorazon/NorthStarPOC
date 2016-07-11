package com.tr.microsvcs.dw.model;

import java.util.Date;

/**
 * Created by u6034037 on 7/11/2016.
 */
public class SearchableSpreadsheet {

    public SearchableSpreadsheet(long id, long firmId)
    {
        SpreadsheetId = id;
        FirmId = firmId;
    }
    public SearchableSpreadsheet()
    {
        SpreadsheetId = 0;
        FirmId = 0;
    }

    public long SpreadsheetId;
    public String SpreadsheetType;
    public long FirmId;

    public String Client;
    public String User;
    public long Version;
    public String Name;
    public String NameEng;
    public String NameSimple;
    public String CreatedBy;
    public Date Created;
    public String LastModifiedBy;
    public Date Modified;

    //[Attachment(Name = "file")]
    public String File;
    public long FileSize;
    public String Keywords;
    public String FileName;
    public String ContentHash;
    public String Description;

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
