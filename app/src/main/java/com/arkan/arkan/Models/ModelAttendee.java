package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelAttendee {
    private String attendeeID, displayImageUrl, displayName, isMOMApproved
            , userID;
    private ModelMeeting meeting;

    public String getAttendeeID() {
        return attendeeID;
    }

    public void setAttendeeID(String attendeeID) {
        this.attendeeID = attendeeID;
    }

    public String getDisplayImageUrl() {
        return displayImageUrl;
    }

    public void setDisplayImageUrl(String displayImageUrl) {
        this.displayImageUrl = displayImageUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getIsMOMApproved() {
        return isMOMApproved;
    }

    public void setIsMOMApproved(String isMOMApproved) {
        this.isMOMApproved = isMOMApproved;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public ModelMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(ModelMeeting meeting) {
        this.meeting = meeting;
    }

    public ModelAttendee() {

    }

    public ModelAttendee(String attendeeID, String displayImageUrl, String displayName, String isMOMApproved, String userID, ModelMeeting meeting) {

        this.attendeeID = attendeeID;
        this.displayImageUrl = displayImageUrl;
        this.displayName = displayName;
        this.isMOMApproved = isMOMApproved;
        this.userID = userID;
        this.meeting = meeting;
    }
}
