package com.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * Created by root on 2019/12/3.
 */
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        String auth = "admin:enjoy";
        byte[] encodedAuth = Base64.getEncoder()
                .encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
        String authHeader = "Basic " + new String(encodedAuth);
        headers.set("Authorization", authHeader);
        return headers;
    }
}
