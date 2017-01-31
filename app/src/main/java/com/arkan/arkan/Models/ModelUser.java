package com.arkan.arkan.Models;

/**
 * Created by mbp on 30/01/2017.
 */

public class ModelUser {
    private String displayImageUrl, displayName, isChairman, userID, isTopManagement
            , isBoardMembers, isRemunerationCommittee, isAuditCommittee;

    public String getDisplayImageUrl() {
        return displayImageUrl;
    }

    public void setDisplayImageUrl(String displayImageUrl) {
        this.displayImageUrl = displayImageUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getIsChairman() {
        return isChairman;
    }

    public void setIsChairman(String isChairman) {
        this.isChairman = isChairman;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getIsTopManagement() {
        return isTopManagement;
    }

    public void setIsTopManagement(String isTopManagement) {
        this.isTopManagement = isTopManagement;
    }

    public String getIsBoardMembers() {
        return isBoardMembers;
    }

    public void setIsBoardMembers(String isBoardMembers) {
        this.isBoardMembers = isBoardMembers;
    }

    public String getIsRemunerationCommittee() {
        return isRemunerationCommittee;
    }

    public void setIsRemunerationCommittee(String isRemunerationCommittee) {
        this.isRemunerationCommittee = isRemunerationCommittee;
    }

    public String getIsAuditCommittee() {
        return isAuditCommittee;
    }

    public void setIsAuditCommittee(String isAuditCommittee) {
        this.isAuditCommittee = isAuditCommittee;
    }

    public ModelUser() {

    }

    public ModelUser(String displayImageUrl, String displayName, String isChairman, String userID, String isTopManagement, String isBoardMembers, String isRemunerationCommittee, String isAuditCommittee) {

        this.displayImageUrl = displayImageUrl;
        this.displayName = displayName;
        this.isChairman = isChairman;
        this.userID = userID;
        this.isTopManagement = isTopManagement;
        this.isBoardMembers = isBoardMembers;
        this.isRemunerationCommittee = isRemunerationCommittee;
        this.isAuditCommittee = isAuditCommittee;
    }
}
