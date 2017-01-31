package com.arkan.arkan.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mbp on 01/01/2017.
 */

public class MainDatabase extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "arkan.db";

    //Tables
    public static final String TABLE_USER = "user";
    public static final String TABLE_TASK = "task";
    public static final String TABLE_DISCUSSIONMEMBER = "discussionMember";

    //USER TABLE ATTRIBUTES
    private static final String COLUMN_DISPLAYIMAGEURL = "displayImageUrl";
    private static final String COLUMN_DISPLAYNAME = "displayName";
    private static final String COLUMN_ISAUDITCOMMITEE = "isAuditCommitee";
    private static final String COLUMN_ISBOARDMEMBERS = "isBoardMembers";
    private static final String COLUMN_ISCHAIRMAN = "isChairMan";
    private static final String COLUMN_ISREMUNERATIONCOMMITEE = "isRemunerationCommitee";
    private static final String COLUMN_USERID = "userID";
    //TASK TABLE ATTRIBUTES
    private static final String COLUMN_CREATEDDATE = "createdDate";
    private static final String COLUMN_DUEDATE = "dueDate";
    private static final String COLUMN_MEETINGID = "meetingID";
    private static final String COLUMN_MEETINGSTARTDATE = "meetingStartDate";
    private static final String COLUMN_MEETINGTITLE = "meetingTitle";
    private static final String COLUMN_NAMEASSIGNTO = "nameAssignTo";
    private static final String COLUMN_STATUS = "status";
    private static final String COLUMN_TASKDESCRIPTION = "columnDescription";
    private static final String COLUMN_TASKID = "taskID";
    private static final String COLUMN_TITLE = "title";
    //DISCUSSION TABLE ATTRIBUTES
    private static final String COLUMN_MEMBERID = "memberID";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_PICTUREURL = "pictureUrl";
    private static final String COLUMN_USER_ID = "userID";


    public MainDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //User table creation
        String query = "CREATE TABLE " + TABLE_USER + "(" +
                COLUMN_USERID + " INTEGER PRIMARY KEY " + "," +
                COLUMN_DISPLAYIMAGEURL + " TEXT " + "," +
                COLUMN_DISPLAYNAME + " TEXT " + "," +
                COLUMN_ISAUDITCOMMITEE + " TEXT " + "," +
                COLUMN_ISBOARDMEMBERS + " TEXT " + "," +
                COLUMN_ISCHAIRMAN + " TEXT " + "," +
                COLUMN_ISREMUNERATIONCOMMITEE + " TEXT" +
                ");";
        sqLiteDatabase.execSQL(query);
        //Task table creation
        query = "CREATE TABLE " + TABLE_TASK + "(" +
                COLUMN_MEETINGID + " INTEGER PRIMARY KEY " + "," +
                COLUMN_CREATEDDATE + " TEXT " + "," +
                COLUMN_DUEDATE + " TEXT " + "," +
                COLUMN_MEETINGSTARTDATE + " TEXT " + "," +
                COLUMN_MEETINGTITLE + " TEXT " + "," +
                COLUMN_NAMEASSIGNTO + " TEXT " + "," +
                COLUMN_STATUS + " TEXT" + "," +
                COLUMN_TASKDESCRIPTION + " TEXT " + "," +
                COLUMN_TASKID + " TEXT " + "," +
                COLUMN_TITLE + " TEXT" +
                ");";
        sqLiteDatabase.execSQL(query);
        //Discussion member table creation
        query = "CREATE TABLE " + TABLE_DISCUSSIONMEMBER + "(" +
                COLUMN_MEMBERID + " INTEGER PRIMARY KEY " + "," +
                COLUMN_NAME + " TEXT " + "," +
                COLUMN_PICTUREURL + " TEXT " + "," +
                COLUMN_USER_ID + " TEXT" +
                ");";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_TASK);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_DISCUSSIONMEMBER);
    }
}
