package com.lakshmi.metro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class ActiveUsersService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public String getActiveUsers() {
        // Fetch active users from Redis
        return redisTemplate.opsForValue().get("active-users");
    }
}
