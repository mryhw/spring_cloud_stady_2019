package com.mr.msprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        10:26 2019-11-12
 * @Version     v1
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient  //服务发现
public class MsProviderApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(MsProviderApplication8002.class, args);
    }
}
