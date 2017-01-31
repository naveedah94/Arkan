package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelAnnouncements {
    private String announcementID, announcementDescription, createdByName, createdDate,
            expiryDate, title, createdByID, displayImageUrl, meetingID;

    public ModelAnnouncements() {
    }

    public String getAnnouncementID() {

        return announcementID;
    }

    public void setAnnouncementID(String announcementID) {
        this.announcementID = announcementID;
    }

    public String getAnnouncementDescription() {
        return announcementDescription;
    }

    public void setAnnouncementDescription(String announcementDescription) {
        this.announcementDescription = announcementDescription;
    }

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

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedByID() {
        return createdByID;
    }

    public void setCreatedByID(String createdByID) {
        this.createdByID = createdByID;
    }

    public String getDisplayImageUrl() {
        return displayImageUrl;
    }

    public void setDisplayImageUrl(String displayImageUrl) {
        this.displayImageUrl = displayImageUrl;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public ModelAnnouncements(String announcementID, String announcementDescription, String createdByName, String createdDate, String expiryDate, String title, String createdByID, String displayImageUrl, String meetingID) {

        this.announcementID = announcementID;
        this.announcementDescription = announcementDescription;
        this.createdByName = createdByName;
        this.createdDate = createdDate;
        this.expiryDate = expiryDate;
        this.title = title;
        this.createdByID = createdByID;
        this.displayImageUrl = displayImageUrl;
        this.meetingID = meetingID;
    }
}
