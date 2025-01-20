package com.bhagya.practice.model;

import com.bhagya.practice.User;

public class Passenger {

    private String fullName;
    private long MoNo;
    private User type;
    private long UIDno;


    @Override
    public String toString() {
        return "Passenger{" +
                "fullName='" + fullName + '\'' +
                ", MoNo=" + MoNo +
                ", type=" + type +
                ", UIDno=" + UIDno +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getMoNo() {
        return MoNo;
    }

    public void setMoNo(long moNo) {
        MoNo = moNo;
    }

    public User getType() {
        return type;
    }

    public void setType(User type) {
        this.type = type;
    }

    public long getUIDno() {
        return UIDno;
    }

    public void setUIDno(long UIDno) {
        this.UIDno = UIDno;
    }
}
