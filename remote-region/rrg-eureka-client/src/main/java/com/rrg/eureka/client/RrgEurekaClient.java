package com.rrg.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by tanhuayou on 2019/01/22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RrgEurekaClient {
    public static void main(String[] args) {
        SpringApplication.run(RrgEurekaClient.class, args);
    }
}
