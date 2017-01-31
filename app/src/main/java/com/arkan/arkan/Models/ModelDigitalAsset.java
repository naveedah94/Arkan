package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelDigitalAsset {
    private String createdByName, createdDate, digitalAssetID, downloadUrlForMeetingFiles
            , extension, fileName, fileVersion, isFileFromMeeting, isFolder, meetingID, meetingStartDate
            , meetingTitle, ownerName, updatedByName, path, updatedDate, attachmentType, versionHistory;

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDigitalAssetID() {
        return digitalAssetID;
    }

    public void setDigitalAssetID(String digitalAssetID) {
        this.digitalAssetID = digitalAssetID;
    }

    public String getDownloadUrlForMeetingFiles() {
        return downloadUrlForMeetingFiles;
    }

    public void setDownloadUrlForMeetingFiles(String downloadUrlForMeetingFiles) {
        this.downloadUrlForMeetingFiles = downloadUrlForMeetingFiles;
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

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getIsFileFromMeeting() {
        return isFileFromMeeting;
    }

    public void setIsFileFromMeeting(String isFileFromMeeting) {
        this.isFileFromMeeting = isFileFromMeeting;
    }

    public String getIsFolder() {
        return isFolder;
    }

    public void setIsFolder(String isFolder) {
        this.isFolder = isFolder;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public String getMeetingStartDate() {
        return meetingStartDate;
    }

    public void setMeetingStartDate(String meetingStartDate) {
        this.meetingStartDate = meetingStartDate;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getUpdatedByName() {
        return updatedByName;
    }

    public void setUpdatedByName(String updatedByName) {
        this.updatedByName = updatedByName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getVersionHistory() {
        return versionHistory;
    }

    public void setVersionHistory(String versionHistory) {
        this.versionHistory = versionHistory;
    }

    public ModelDigitalAsset() {

    }

    public ModelDigitalAsset(String createdByName, String createdDate, String digitalAssetID, String downloadUrlForMeetingFiles, String extension, String fileName, String fileVersion, String isFileFromMeeting, String isFolder, String meetingID, String meetingStartDate, String meetingTitle, String ownerName, String updatedByName, String path, String updatedDate, String attachmentType, String versionHistory) {

        this.createdByName = createdByName;
        this.createdDate = createdDate;
        this.digitalAssetID = digitalAssetID;
        this.downloadUrlForMeetingFiles = downloadUrlForMeetingFiles;
        this.extension = extension;
        this.fileName = fileName;
        this.fileVersion = fileVersion;
        this.isFileFromMeeting = isFileFromMeeting;
        this.isFolder = isFolder;
        this.meetingID = meetingID;
        this.meetingStartDate = meetingStartDate;
        this.meetingTitle = meetingTitle;
        this.ownerName = ownerName;
        this.updatedByName = updatedByName;
        this.path = path;
        this.updatedDate = updatedDate;
        this.attachmentType = attachmentType;
        this.versionHistory = versionHistory;
    }
}
