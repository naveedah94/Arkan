package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelTask {
    private String createdDate, dueDate, meetingStartDate, meetingTitle
            , status, taskDescription, taskID, title, meetingID, nameAssignTo;

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getMeetingStartDate() {
        return meetingStartDate;
    }

    public void setMeetingStartDate(String meetingStartDate) {
        this.meetingStartDate = meetingStartDate;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public String getNameAssignTo() {
        return nameAssignTo;
    }

    public void setNameAssignTo(String nameAssignTo) {
        this.nameAssignTo = nameAssignTo;
    }

    public ModelTask() {

    }

    public ModelTask(String createdDate, String dueDate, String meetingStartDate, String meetingTitle, String status, String taskDescription, String taskID, String title, String meetingID, String nameAssignTo) {

        this.createdDate = createdDate;
        this.dueDate = dueDate;
        this.meetingStartDate = meetingStartDate;
        this.meetingTitle = meetingTitle;
        this.status = status;
        this.taskDescription = taskDescription;
        this.taskID = taskID;
        this.title = title;
        this.meetingID = meetingID;
        this.nameAssignTo = nameAssignTo;
    }
}
