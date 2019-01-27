package com.hystrix.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * EnableHystrix 开启断路器
 * Created by tanhuayou on 2019/01/23
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
public class HystrixClientApp {
    public static void main(String[] args) {
        SpringApplication.run(HystrixClientApp.class, args);
    }
}
