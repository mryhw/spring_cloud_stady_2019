package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        16:52 2019-11-19
 * @Version     v1
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class MsConfigServerLocalApplication2233 {
    public static void main(String[] args) {
        SpringApplication.run(MsConfigServerLocalApplication2233.class, args);
    }
}
