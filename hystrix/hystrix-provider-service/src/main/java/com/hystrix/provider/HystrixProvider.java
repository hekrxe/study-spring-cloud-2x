package com.hystrix.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by tanhuayou on 2019/01/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HystrixProvider {
    public static void main(String[] args) {
        SpringApplication.run(HystrixProvider.class, args);
    }
}
