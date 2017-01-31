package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelDelegateAsChaiman {
    private String delegateID, delegateName, delegateUserName
            , delegateWorkEmail;
    private ModelMeeting meeting;

    public String getDelegateID() {
        return delegateID;
    }

    public void setDelegateID(String delegateID) {
        this.delegateID = delegateID;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }

    public String getDelegateUserName() {
        return delegateUserName;
    }

    public void setDelegateUserName(String delegateUserName) {
        this.delegateUserName = delegateUserName;
    }

    public String getDelegateWorkEmail() {
        return delegateWorkEmail;
    }

    public void setDelegateWorkEmail(String delegateWorkEmail) {
        this.delegateWorkEmail = delegateWorkEmail;
    }

    public ModelMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(ModelMeeting meeting) {
        this.meeting = meeting;
    }

    public ModelDelegateAsChaiman() {

    }

    public ModelDelegateAsChaiman(String delegateID, String delegateName, String delegateUserName, String delegateWorkEmail, ModelMeeting meeting) {

        this.delegateID = delegateID;
        this.delegateName = delegateName;
        this.delegateUserName = delegateUserName;
        this.delegateWorkEmail = delegateWorkEmail;
        this.meeting = meeting;
    }
}
