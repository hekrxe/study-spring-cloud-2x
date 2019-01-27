package com.ribbon.client.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
public class TestController {

    @GetMapping("/add")
    public String add(Integer a, Integer b, HttpServletRequest request) {
        return "From port: " + request.getServerPort() + ", " + a + " + " + b + " = " + (a + b);
    }
}
