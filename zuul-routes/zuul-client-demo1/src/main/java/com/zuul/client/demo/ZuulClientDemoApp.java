package com.zuul.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by tanhuayou on 2019/01/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulClientDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulClientDemoApp.class, args);
    }
}
