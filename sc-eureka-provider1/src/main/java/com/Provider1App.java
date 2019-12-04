package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by root on 2019/12/2.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Provider1App {
    public static void main(String[] args) {
        SpringApplication.run(Provider1App.class,args);
    }
}
