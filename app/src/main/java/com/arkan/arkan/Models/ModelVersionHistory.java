package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelVersionHistory {
    private String fileVersion, modifiedDate, modifyByName;
    private ModelDigitalAsset digitalAsset;

    public ModelVersionHistory() {
    }

    public String getFileVersion() {

        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifyByName() {
        return modifyByName;
    }

    public void setModifyByName(String modifyByName) {
        this.modifyByName = modifyByName;
    }

    public ModelDigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public void setDigitalAsset(ModelDigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
    }

    public ModelVersionHistory(String fileVersion, String modifiedDate, String modifyByName, ModelDigitalAsset digitalAsset) {

        this.fileVersion = fileVersion;
        this.modifiedDate = modifiedDate;
        this.modifyByName = modifyByName;
        this.digitalAsset = digitalAsset;
    }
}
