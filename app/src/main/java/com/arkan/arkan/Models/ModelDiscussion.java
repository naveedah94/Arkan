package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelDiscussion {
    private String commentCount, createdByName, createdDate, discussionDescription
            , discussionID, discussionTopicID, status, title, updatedDate, createdByID
            , displayImageUrl, discussionComment;

    public ModelDiscussion() {
    }

    public String getCommentCount() {

        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
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

    public String getDiscussionDescription() {
        return discussionDescription;
    }

    public void setDiscussionDescription(String discussionDescription) {
        this.discussionDescription = discussionDescription;
    }

    public String getDiscussionID() {
        return discussionID;
    }

    public void setDiscussionID(String discussionID) {
        this.discussionID = discussionID;
    }

    public String getDiscussionTopicID() {
        return discussionTopicID;
    }

    public void setDiscussionTopicID(String discussionTopicID) {
        this.discussionTopicID = discussionTopicID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
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

    public String getDiscussionComment() {
        return discussionComment;
    }

    public void setDiscussionComment(String discussionComment) {
        this.discussionComment = discussionComment;
    }

    public ModelDiscussion(String commentCount, String createdByName, String createdDate, String discussionDescription, String discussionID, String discussionTopicID, String status, String title, String updatedDate, String createdByID, String displayImageUrl, String discussionComment) {

        this.commentCount = commentCount;
        this.createdByName = createdByName;
        this.createdDate = createdDate;
        this.discussionDescription = discussionDescription;
        this.discussionID = discussionID;
        this.discussionTopicID = discussionTopicID;
        this.status = status;
        this.title = title;
        this.updatedDate = updatedDate;
        this.createdByID = createdByID;
        this.displayImageUrl = displayImageUrl;
        this.discussionComment = discussionComment;
    }
}
