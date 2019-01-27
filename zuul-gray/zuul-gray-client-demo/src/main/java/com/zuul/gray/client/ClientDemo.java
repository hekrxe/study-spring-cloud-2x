package com.zuul.gray.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tanhuayou on 2019/01/27
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientDemo {
    public static void main(String[] args) {
        SpringApplication.run(ClientDemo.class, args);
    }


    @GetMapping("invoke")
    public int invoke(HttpServletRequest request) {
        return request.getServerPort();
    }
}
