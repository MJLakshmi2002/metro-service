package com.lakshmi.metro.service;

import com.lakshmi.metro.model.Station;
import com.lakshmi.metro.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
public class StationService {
    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public String getAllStations() {
        // Check Redis cache first
        String cachedStations = redisTemplate.opsForValue().get("stations");
        if (cachedStations != null) {
            return cachedStations;
        }
        // Fetch from database if not in cache
        List<Station> stations = stationRepository.findAll();
        String stationsJson = convertToJson(stations);
        redisTemplate.opsForValue().set("stations", stationsJson);
        return stationsJson;
    }

    public String addStation(String stationName) {
        Station station = new Station();
        station.setName(stationName);
        stationRepository.save(station);
        return "Station added successfully";
    }

    public String deleteStation(String id) {
        stationRepository.deleteById(id);
        return "Station deleted successfully";
    }
    private String convertToJson(List<Station> stations) {
        // Dummy JSON conversion
        return stations.toString();
    }
}
