package com.rrg.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by tanhuayou on 2019/01/22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class RrgZuulGateway {
    public static void main(String[] args) {
        SpringApplication.run(RrgZuulGateway.class, args);
    }
}
