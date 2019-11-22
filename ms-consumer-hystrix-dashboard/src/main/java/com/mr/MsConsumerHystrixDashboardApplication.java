package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description 开启 仪表盘的 监控
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        14:26 2019-11-18
 * @Version     v1
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class MsConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConsumerHystrixDashboardApplication.class, args);
    }
}
