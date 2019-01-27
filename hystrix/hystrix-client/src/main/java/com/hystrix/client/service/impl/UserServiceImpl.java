package com.hystrix.client.service.impl;

import com.hystrix.client.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by tanhuayou on 2019/01/23
 */
@Service
public class UserServiceImpl implements UserService {


    @HystrixCommand(fallbackMethod = "defaultUser")
    @Override
    public String getUser(String username) {
        if ("spring".equalsIgnoreCase(username)) {
            throw new RuntimeException();
        }
        return "Normal: " + username;
    }

    public String defaultUser(String username) {
        return "DefaultUserInfo:" + username;
    }
}
