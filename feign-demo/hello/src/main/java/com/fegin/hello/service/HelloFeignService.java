package com.fegin.hello.service;

import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tanhuayou on 2019/01/23
 */
@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignService.HelloFeignServiceConfig.class)
public interface HelloFeignService {


    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    ResponseEntity<byte[]> search(@RequestParam("q") String query);

    @Configuration
    class HelloFeignServiceConfig {
        @Bean
        public Logger.Level feignLoggerLevel() {
            return Logger.Level.FULL;
        }
    }
}
