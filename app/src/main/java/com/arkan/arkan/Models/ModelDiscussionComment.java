package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelDiscussionComment {
    private String comment, commentDiscussionID, commentBy, commentByID
            , commentID, createdDate, commentPicture;
    private ModelDiscussion discussion;

    public ModelDiscussionComment() {
    }

    public String getComment() {

        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentDiscussionID() {
        return commentDiscussionID;
    }

    public void setCommentDiscussionID(String commentDiscussionID) {
        this.commentDiscussionID = commentDiscussionID;
    }

    public String getCommentBy() {
        return commentBy;
    }

    public void setCommentBy(String commentBy) {
        this.commentBy = commentBy;
    }

    public String getCommentByID() {
        return commentByID;
    }

    public void setCommentByID(String commentByID) {
        this.commentByID = commentByID;
    }

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCommentPicture() {
        return commentPicture;
    }

    public void setCommentPicture(String commentPicture) {
        this.commentPicture = commentPicture;
    }

    public ModelDiscussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(ModelDiscussion discussion) {
        this.discussion = discussion;
    }

    public ModelDiscussionComment(String comment, String commentDiscussionID, String commentBy, String commentByID, String commentID, String createdDate, String commentPicture, ModelDiscussion discussion) {

        this.comment = comment;
        this.commentDiscussionID = commentDiscussionID;
        this.commentBy = commentBy;
        this.commentByID = commentByID;
        this.commentID = commentID;
        this.createdDate = createdDate;
        this.commentPicture = commentPicture;
        this.discussion = discussion;
    }
}
