package com.arkan.arkan.Models;

import java.util.Date;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelAgenda {
    private String agendaID;
    private String createdDate;
    private String note, subject, owner, time;
    private ModelMeeting meeting;

    public ModelAgenda() {
    }

    public String getAgendaID() {

        return agendaID;
    }

    public void setAgendaID(String agendaID) {
        this.agendaID = agendaID;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ModelMeeting getMeeting() {
        return meeting;
    }

    public void setMeeting(ModelMeeting meeting) {
        this.meeting = meeting;
    }

    public ModelAgenda(String agendaID, String createdDate, String note, String subject, String owner, String time, ModelMeeting meeting) {

        this.agendaID = agendaID;
        this.createdDate = createdDate;
        this.note = note;
        this.subject = subject;
        this.owner = owner;
        this.time = time;
        this.meeting = meeting;
    }
}
