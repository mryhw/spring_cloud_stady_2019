package com.mr.msconsumer;

import com.mr.irule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description 测试 Ribbon 定制化的负载均衡
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        11:43 2019-11-12
 * @Version     v1
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MS-PROVIDER", configuration = MySelfRule.class)
public class MsConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsConsumerApplication.class, args);
    }
}
