package com.mr.msconsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
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


    /**
     * 自定义负载均衡策略
     */
    @Bean
    public IRule myIRule() {

        // 切换 ribbon 的 随机的负载均衡算法
        /**
         * RoundRobinRule  默认是 轮训
         * RandomRule 随机
         * AvailabilityFilteringRule
         * WeightedResponseTimeRule
         * RetryRule       默认是轮训，如果有节点 down 机，重试几次之后，不在尝试
         * BestAvailableRule
         * ZoneAvoidanceRule
         */
        return new RoundRobinRule();
    }

}
