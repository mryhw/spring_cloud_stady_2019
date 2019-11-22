package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        15:32 2019-11-18
 * @Version     v1
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class MsZullGatewayApplication9527 {

    public static void main(String[] args) {
        SpringApplication.run(MsZullGatewayApplication9527.class, args);
    }
}
