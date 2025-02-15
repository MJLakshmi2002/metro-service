package com.lakshmi.metro.controller;


import com.lakshmi.metro.service.ActiveUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/active-users")

public class ActiveUsersController {

    @Autowired
    private ActiveUsersService activeUsersService;

    @GetMapping
    public String getActiveUsers() {
        return activeUsersService.getActiveUsers();
    }
}
