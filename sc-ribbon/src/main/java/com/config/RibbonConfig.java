package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * Created by root on 2019/12/4.
 */
public class RibbonConfig {

    @Bean
    public IRule ribbon(){
        return new RandomRule();
    }
}
