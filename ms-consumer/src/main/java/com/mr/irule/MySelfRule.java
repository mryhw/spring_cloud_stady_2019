package com.mr.irule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        15:29 2019-11-12
 * @Version     v1
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myIRule () {
        return new RandomRule();
    }

}
