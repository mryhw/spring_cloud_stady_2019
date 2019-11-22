package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        10:31 2019-11-12
 * @Version     v1
 **/
@SpringBootApplication
@EnableEurekaServer
public class MsEurekaApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(MsEurekaApplication7002.class, args);
    }
}
