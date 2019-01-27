package com.rrg.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by tanhuayou on 2019/01/22
 */
@SpringBootApplication
@EnableEurekaServer
public class RrgEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(RrgEurekaServer.class, args);
    }
}
