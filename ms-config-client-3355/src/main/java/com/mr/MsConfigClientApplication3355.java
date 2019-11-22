package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        14:14 2019-11-19
 * @Version     v1
 **/
@EnableEurekaClient
@SpringBootApplication
public class MsConfigClientApplication3355 {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigClientApplication3355.class, args);
    }
}
