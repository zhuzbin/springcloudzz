package com;

import com.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by root on 2019/12/2.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SC-EUREKA-PROVIDER-PRODUCT-APPNME",configuration = RibbonConfig.class)
public class RibbonApp {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApp.class,args);
    }
}
