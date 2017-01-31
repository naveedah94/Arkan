package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelDiscussionMember {
    private String memberID, name, pictureUrl, userID;

    public ModelDiscussionMember() {
    }

    public String getMemberID() {

        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public ModelDiscussionMember(String memberID, String name, String pictureUrl, String userID) {

        this.memberID = memberID;
        this.name = name;
        this.pictureUrl = pictureUrl;
        this.userID = userID;
    }
}
