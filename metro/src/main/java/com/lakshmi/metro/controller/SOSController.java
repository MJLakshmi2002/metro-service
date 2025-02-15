package com.lakshmi.metro.controller;
import com.lakshmi.metro.service.SOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/sos")

public class SOSController {
    @Autowired
    private SOSService sosService;

    @PostMapping
    public String triggerSOS(@RequestParam String userId) {
        return sosService.triggerSOS(userId);
    }
}
