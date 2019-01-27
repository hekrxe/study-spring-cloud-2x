package com.hystrix.consumer.service.impl;

import com.hystrix.consumer.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by tanhuayou on 2019/01/23
 */
@Service
public class UserServiceFallbackImpl implements UserService {
    @Override
    public String getUser(String username) {
        return "Fallback info: " + username;
    }
}
