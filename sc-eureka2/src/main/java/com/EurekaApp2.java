package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by root on 2019/12/3.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp2.class,args);
    }
}
