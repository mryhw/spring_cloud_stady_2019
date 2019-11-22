package com.mr.msconsumerfeign.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced        // 基于NetFlix Ribbon 实现的 一套 客户端的负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
