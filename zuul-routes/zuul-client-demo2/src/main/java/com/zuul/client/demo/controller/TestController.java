package com.zuul.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
@RequestMapping("/b")
public class TestController {

    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @GetMapping("/x/add")
    public Integer aadd(Integer a, Integer b) {
        return a + b;
    }

    @GetMapping("/sub")
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @GetMapping("/mul")
    public String mul(Integer a, Integer b) {
        return "client-b-" + a * b;
    }

    @GetMapping("/div")
    public Integer div(Integer a, Integer b) {
        return a / b;
    }
}
