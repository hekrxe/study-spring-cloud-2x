package com.hystrix.consumer.service;

import com.hystrix.consumer.service.impl.UserServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tanhuayou on 2019/01/23
 */
@FeignClient(name = "hystrix-provider-service", fallback = UserServiceFallbackImpl.class)
public interface UserService {

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    String getUser(@RequestParam("username") String username);
}
