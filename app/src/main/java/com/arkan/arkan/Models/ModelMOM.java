package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelMOM {
    private String momID, momTitle, contact, createdDate
            , decision, momDescription;
    private ModelMeeting meeting;

    public String getMomID() {
        return momID;
    }

    public void setMomID(String momID) {
        this.momID = momID;
    }

    public String getMomTitle() {
        return momTitle;
    }

    public void setMomTitle(String momTitle) {
        this.momTitle = momTitle;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getMomDescription() {
        return momDescription;
    }

    public void setMomDescription(String momDescription) {
        this.momDescription = momDescription;
    }

    public ModelMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(ModelMeeting meeting) {
        this.meeting = meeting;
    }

    public ModelMOM() {

    }

    public ModelMOM(String momID, String momTitle, String contact, String createdDate, String decision, String momDescription, ModelMeeting meeting) {

        this.momID = momID;
        this.momTitle = momTitle;
        this.contact = contact;
        this.createdDate = createdDate;
        this.decision = decision;
        this.momDescription = momDescription;
        this.meeting = meeting;
    }
}
