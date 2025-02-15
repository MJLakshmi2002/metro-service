package com.lakshmi.metro.controller;
import com.lakshmi.metro.service.CheckInOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkinout")

public class CheckInOutController {
    @Autowired
    private CheckInOutService checkInOutService;

    @PostMapping("/checkin")
    public String checkIn(@RequestParam String userId, @RequestParam String qrCode) {
        return checkInOutService.checkIn(userId, qrCode);
    }

    @PostMapping("/checkout")
    public String checkOut(@RequestParam String userId) {
        return checkInOutService.checkOut(userId);
    }
}
