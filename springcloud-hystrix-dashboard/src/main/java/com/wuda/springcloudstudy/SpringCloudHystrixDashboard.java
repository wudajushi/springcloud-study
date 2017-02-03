package com.wuda.springcloudstudy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudHystrixDashboard {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudHystrixDashboard.class).web(true).run(args);
    }
}
