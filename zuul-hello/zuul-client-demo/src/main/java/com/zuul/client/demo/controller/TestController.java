package com.zuul.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
public class TestController {
    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        System.out.println("a=" + a + ",b=" + b);
        return a + b;
    }
}
