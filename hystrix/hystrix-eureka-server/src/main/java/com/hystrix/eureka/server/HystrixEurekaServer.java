package com.hystrix.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by tanhuayou on 2019/01/23
 */
@SpringBootApplication
@EnableEurekaServer
public class HystrixEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaServer.class, args);
    }
}
