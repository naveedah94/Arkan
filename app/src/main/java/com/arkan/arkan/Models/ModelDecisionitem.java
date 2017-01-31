package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelDecisionitem {
    private String decisionItemID, decisionTitle, createdDate, decision
            , decisionDescription;
    private ModelMeeting meeting;

    public String getDecisionItemID() {
        return decisionItemID;
    }

    public void setDecisionItemID(String decisionItemID) {
        this.decisionItemID = decisionItemID;
    }

    public String getDecisionTitle() {
        return decisionTitle;
    }

    public void setDecisionTitle(String decisionTitle) {
        this.decisionTitle = decisionTitle;
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

    public String getDecisionDescription() {
        return decisionDescription;
    }

    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }

    public ModelMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(ModelMeeting meeting) {
        this.meeting = meeting;
    }

    public ModelDecisionitem() {

    }

    public ModelDecisionitem(String decisionItemID, String decisionTitle, String createdDate, String decision, String decisionDescription, ModelMeeting meeting) {

        this.decisionItemID = decisionItemID;
        this.decisionTitle = decisionTitle;
        this.createdDate = createdDate;
        this.decision = decision;
        this.decisionDescription = decisionDescription;
        this.meeting = meeting;
    }
}
