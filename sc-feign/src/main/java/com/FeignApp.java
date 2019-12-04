package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by root on 2019/12/2.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.service")
public class FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class,args);
    }
}
