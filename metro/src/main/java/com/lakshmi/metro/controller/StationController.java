package com.lakshmi.metro.controller;
import com.lakshmi.metro.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stations")

public class StationController {

    @Autowired
    private StationService stationService;

    @GetMapping
    public String getAllStations() {
        return stationService.getAllStations();
    }

    @PostMapping
    public String addStation(@RequestParam String stationName) {
        return stationService.addStation(stationName);
    }

    @DeleteMapping("/{id}")
    public String deleteStation(@PathVariable String id) {
        return stationService.deleteStation(id);
    }
}
