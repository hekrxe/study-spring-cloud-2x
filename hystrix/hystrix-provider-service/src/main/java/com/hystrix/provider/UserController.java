package com.hystrix.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
public class UserController {

    @GetMapping("/getUser")
    public String test(@RequestParam("username") String username) {
        return "Provider: " + username;
    }
}
