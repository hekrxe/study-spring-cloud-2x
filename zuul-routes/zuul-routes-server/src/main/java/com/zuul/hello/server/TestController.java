package com.zuul.hello.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
public class TestController {
    @GetMapping("/client")
    public String add(Integer a, Integer b) {
        return "本地跳转：" + (a + b);
    }
}
