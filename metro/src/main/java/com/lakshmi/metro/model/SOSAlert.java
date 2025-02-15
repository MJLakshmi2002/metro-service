package com.lakshmi.metro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;
@Entity
public class SOSAlert {
    @Id
    private String id;
    private String userId;
    private long timestamp;
}
