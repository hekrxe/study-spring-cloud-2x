package com.mz.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * http://localhost:10001/mz-eureka-server/actuator/env
 * http://localhost:10001/mz-eureka-server/actuator/env
 *
 * 处于zone1的gateway访问的是处于zone1的server
 * Created by tanhuayou on 2019/01/22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MzZuulGateway {
    public static void main(String[] args) {
        SpringApplication.run(MzZuulGateway.class, args);
    }
}
