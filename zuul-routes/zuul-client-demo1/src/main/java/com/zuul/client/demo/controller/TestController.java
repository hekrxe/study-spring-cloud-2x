package com.zuul.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
@RequestMapping("/a")
public class TestController {
    @GetMapping("/add")
    public String add(Integer a, Integer b) {
        return "1add: " + (a + b);
    }

    @GetMapping("/x/add")
    public String xadd(Integer a, Integer b) {
        return "1xadd: " + (a + b);
    }

    @GetMapping("/sub")
    public String sub(Integer a, Integer b) {
        return "1sub: " + (a - b);
    }

    @GetMapping("/mul")
    public String mul(Integer a, Integer b) {
        return "1mul: " + (a * b);
    }

    @GetMapping("/div")
    public String div(Integer a, Integer b) {
        return "1div: " + (a / b);
    }
}
