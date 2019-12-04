package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

/**
 * Created by root on 2019/12/3.
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public BasicAuthenticationInterceptor getBasicAuthRequestInterceptor(){
        return new BasicAuthenticationInterceptor("admin","enjoy");
    }
}
