package com.mz.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by tanhuayou on 2019/01/22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MzEurekaClient {
    public static void main(String[] args) {
        SpringApplication.run(MzEurekaClient.class, args);
    }
}
