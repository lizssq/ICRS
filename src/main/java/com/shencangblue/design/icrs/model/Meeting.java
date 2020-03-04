package com.shencangblue.design.icrs.model;

import java.sql.Timestamp;

public class Meeting {
    private long meetingId;
    private String meetingName;
    private int roomId;
    private int reservationIsTid;
    private int numberOfParticipants;
    private Timestamp startTime;
    private Timestamp endTime;
    private Timestamp reservationTime;
    private Timestamp canceledTime;
    private String description;
    private int status;
    private String roomName;
    private String stuName;
    private String canceledReason;

    public Meeting(){

    }
    public Meeting(long meetingId,String meetingName,int roomId,int reservationIsTid,int numberOfParticipants,
                   Timestamp startTime,Timestamp endTime,Timestamp reservationTime,Timestamp canceledTime,
                   String description,int status,String roomName,String stuName ,String canceledReason){
        this.meetingId =meetingId;
        this.meetingName=meetingName;
        this.roomId=roomId;
        this.reservationIsTid= reservationIsTid;
        this.numberOfParticipants =numberOfParticipants;
        this.startTime =startTime;
        this.endTime =endTime;
        this.reservationTime=reservationTime;
        this.canceledTime =canceledTime;
        this.description =description;
        this.status=status;
        this.roomName=roomName;
        this.stuName=stuName;
        this.canceledReason=canceledReason;


    }

    public long getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getReservationIsTid() {
        return reservationIsTid;
    }

    public void setReservationIsTid(int reservationIsTid) {
        this.reservationIsTid = reservationIsTid;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Timestamp getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Timestamp reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Timestamp getCanceledTime() {
        return canceledTime;
    }

    public void setCanceledTime(Timestamp canceledTime) {
        this.canceledTime = canceledTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getEmpName() {
        return stuName;
    }

    public void setEmpName(String empName) {
        this.stuName = empName;
    }

    public String getCanceledReason() {
        return canceledReason;
    }

    public void setCanceledReason(String canceledReason) {
        this.canceledReason = canceledReason;
    }
}
