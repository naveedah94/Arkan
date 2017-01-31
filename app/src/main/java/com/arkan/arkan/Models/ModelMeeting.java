package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelMeeting {
    private String attachmentCount, attendeeID, createdDate, endDate, isAllDayEvent
            , isDecisionItemsApproved, isMOMApproved, isRecurrence, isWorkspace
            , meetingDescription, meetingID, meetingStatus, proposedStartTime, startDate
            , title, workspaceName, isMOMReleased, isDecisionItemsReleased, agenda, getAttachmentCount
            , attendee;
    private ModelDelegateAsChaiman delegateAsChairman;
    private String comment, decisionItem, mom;

    public ModelMeeting() {
    }

    public String getAttachmentCount() {

        return attachmentCount;
    }

    public void setAttachmentCount(String attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public String getAttendeeID() {
        return attendeeID;
    }

    public void setAttendeeID(String attendeeID) {
        this.attendeeID = attendeeID;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIsAllDayEvent() {
        return isAllDayEvent;
    }

    public void setIsAllDayEvent(String isAllDayEvent) {
        this.isAllDayEvent = isAllDayEvent;
    }

    public String getIsDecisionItemsApproved() {
        return isDecisionItemsApproved;
    }

    public void setIsDecisionItemsApproved(String isDecisionItemsApproved) {
        this.isDecisionItemsApproved = isDecisionItemsApproved;
    }

    public String getIsMOMApproved() {
        return isMOMApproved;
    }

    public void setIsMOMApproved(String isMOMApproved) {
        this.isMOMApproved = isMOMApproved;
    }

    public String getIsRecurrence() {
        return isRecurrence;
    }

    public void setIsRecurrence(String isRecurrence) {
        this.isRecurrence = isRecurrence;
    }

    public String getIsWorkspace() {
        return isWorkspace;
    }

    public void setIsWorkspace(String isWorkspace) {
        this.isWorkspace = isWorkspace;
    }

    public String getMeetingDescription() {
        return meetingDescription;
    }

    public void setMeetingDescription(String meetingDescription) {
        this.meetingDescription = meetingDescription;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public String getMeetingStatus() {
        return meetingStatus;
    }

    public void setMeetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
    }

    public String getProposedStartTime() {
        return proposedStartTime;
    }

    public void setProposedStartTime(String proposedStartTime) {
        this.proposedStartTime = proposedStartTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public String getIsMOMReleased() {
        return isMOMReleased;
    }

    public void setIsMOMReleased(String isMOMReleased) {
        this.isMOMReleased = isMOMReleased;
    }

    public String getIsDecisionItemsReleased() {
        return isDecisionItemsReleased;
    }

    public void setIsDecisionItemsReleased(String isDecisionItemsReleased) {
        this.isDecisionItemsReleased = isDecisionItemsReleased;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getGetAttachmentCount() {
        return getAttachmentCount;
    }

    public void setGetAttachmentCount(String getAttachmentCount) {
        this.getAttachmentCount = getAttachmentCount;
    }

    public String getAttendee() {
        return attendee;
    }

    public void setAttendee(String attendee) {
        this.attendee = attendee;
    }

    public ModelDelegateAsChaiman getDelegateAsChairman() {
        return delegateAsChairman;
    }

    public void setDelegateAsChairman(ModelDelegateAsChaiman delegateAsChairman) {
        this.delegateAsChairman = delegateAsChairman;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDecisionItem() {
        return decisionItem;
    }

    public void setDecisionItem(String decisionItem) {
        this.decisionItem = decisionItem;
    }

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
    }

    public ModelMeeting(String attachmentCount, String attendeeID, String createdDate, String endDate, String isAllDayEvent, String isDecisionItemsApproved, String isMOMApproved, String isRecurrence, String isWorkspace, String meetingDescription, String meetingID, String meetingStatus, String proposedStartTime, String startDate, String title, String workspaceName, String isMOMReleased, String isDecisionItemsReleased, String agenda, String getAttachmentCount, String attendee, ModelDelegateAsChaiman delegateAsChairman, String comment, String decisionItem, String mom) {

        this.attachmentCount = attachmentCount;
        this.attendeeID = attendeeID;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.isAllDayEvent = isAllDayEvent;
        this.isDecisionItemsApproved = isDecisionItemsApproved;
        this.isMOMApproved = isMOMApproved;
        this.isRecurrence = isRecurrence;
        this.isWorkspace = isWorkspace;
        this.meetingDescription = meetingDescription;
        this.meetingID = meetingID;
        this.meetingStatus = meetingStatus;
        this.proposedStartTime = proposedStartTime;
        this.startDate = startDate;
        this.title = title;
        this.workspaceName = workspaceName;
        this.isMOMReleased = isMOMReleased;
        this.isDecisionItemsReleased = isDecisionItemsReleased;
        this.agenda = agenda;
        this.getAttachmentCount = getAttachmentCount;
        this.attendee = attendee;
        this.delegateAsChairman = delegateAsChairman;
        this.comment = comment;
        this.decisionItem = decisionItem;
        this.mom = mom;
    }
}
