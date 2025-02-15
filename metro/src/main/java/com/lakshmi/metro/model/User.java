package com.lakshmi.metro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.UUID;

@Entity
public class User {
    @Id
    private String userId;
    private String qrCode;
    private long checkInTime;
    // Getter for qrCode

    public String getQrCode() {
        return qrCode;
    }

    // Setter for qrCode
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    // Getter for checkInTime
    public long getCheckInTime() {
        return checkInTime;
    }

    // Setter for checkInTime
    public void setCheckInTime(long checkInTime) {
        this.checkInTime = checkInTime;
    }
}
