package com.lakshmi.metro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SOSService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String triggerSOS(String userId) {
        // Publish alert to Kafka
        kafkaTemplate.send("sos-topic", "SOS Alert from user: " + userId);
        return "SOS alert triggered";
    }
}
