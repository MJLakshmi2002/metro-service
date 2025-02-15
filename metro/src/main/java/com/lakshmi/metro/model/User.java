package com.lakshmi.metro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class User {
    @Id
    private String userId;
    private String qrCode;
    private long checkInTime;
}
