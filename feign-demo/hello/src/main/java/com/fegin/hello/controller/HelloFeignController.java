package com.fegin.hello.controller;

import com.fegin.hello.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanhuayou on 2019/01/23
 */
@RestController
public class HelloFeignController {
    @Autowired
    private HelloFeignService helloFeignService;

    @RequestMapping(value = "/search/github")
    public ResponseEntity<byte[]> search(@RequestParam("str") String str) {
        return helloFeignService.search(str);
    }
}
