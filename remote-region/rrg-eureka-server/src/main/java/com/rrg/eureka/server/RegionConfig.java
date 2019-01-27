package com.rrg.eureka.server;

import com.netflix.discovery.EurekaClientConfig;
import com.netflix.eureka.EurekaServerConfig;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.eureka.server.EurekaServerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EurekaServerConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * Created by tanhuayou on 2019/01/22
 */
@Configuration
@AutoConfigureBefore(EurekaServerAutoConfiguration.class)
public class RegionConfig {

    @Bean
    @ConditionalOnMissingBean
    public EurekaServerConfig eurekaServerConfig(EurekaClientConfig clientConfig) {
        EurekaServerConfigBean serverBean = new EurekaServerConfigBean();
        if (clientConfig.shouldRegisterWithEureka()) {
            serverBean.setRegistrySyncRetries(5);
        }
        // 由于 源码里此字段为null 若不设置 则NPE
        serverBean.setRemoteRegionAppWhitelist(new HashMap<>());
        return serverBean;
    }
}
