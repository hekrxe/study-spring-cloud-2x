package com.hystrix.client.controller;

import com.hystrix.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
public class HystrixController {
    @Autowired
    private UserService userService;


    @GetMapping(value = "test")
    public String test(@RequestParam("u") String username) {
        return userService.getUser(username);
    }
}
