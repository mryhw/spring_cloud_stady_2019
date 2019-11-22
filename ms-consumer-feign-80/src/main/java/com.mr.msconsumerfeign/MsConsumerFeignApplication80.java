package com.mr.msconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        16:59 2019-11-12
 * @Version     v1
 *
 *  包描述 必须是 client 和 controller 的 方法同在的包
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.mr"})
@ComponentScan("com.mr")
public class MsConsumerFeignApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(MsConsumerFeignApplication80.class, args);
    }

}
