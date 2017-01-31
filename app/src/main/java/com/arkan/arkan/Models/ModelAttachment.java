package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelAttachment {
    private String downloadUrl, extension, fileName, attachmentTypeID, attachmentType;
    private ModelMeeting meeting;

    public ModelAttachment() {
    }

    public ModelAttachment(String downloadUrl, String extension, String fileName, String attachmentTypeID, String attachmentType, ModelMeeting meeting) {

        this.downloadUrl = downloadUrl;
        this.extension = extension;
        this.fileName = fileName;
        this.attachmentTypeID = attachmentTypeID;
        this.attachmentType = attachmentType;
        this.meeting = meeting;
    }

    public String getDownloadUrl() {

        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAttachmentTypeID() {
        return attachmentTypeID;
    }

    public void setAttachmentTypeID(String attachmentTypeID) {
        this.attachmentTypeID = attachmentTypeID;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public ModelMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(ModelMeeting meeting) {
        this.meeting = meeting;
    }
}
