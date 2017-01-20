package com.wuda.springcloudstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaServer.class, args);
    }
}
