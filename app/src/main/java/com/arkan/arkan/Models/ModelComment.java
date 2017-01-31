package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelComment {
    private String comment, commentByID, createdDate, name, picture
            , commentType;
    private ModelMeeting meeting;

    public ModelComment() {
    }

    public String getComment() {

        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentByID() {
        return commentByID;
    }

    public void setCommentByID(String commentByID) {
        this.commentByID = commentByID;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public ModelMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(ModelMeeting meeting) {
        this.meeting = meeting;
    }

    public ModelComment(String comment, String commentByID, String createdDate, String name, String picture, String commentType, ModelMeeting meeting) {

        this.comment = comment;
        this.commentByID = commentByID;
        this.createdDate = createdDate;
        this.name = name;
        this.picture = picture;
        this.commentType = commentType;
        this.meeting = meeting;
    }
}
