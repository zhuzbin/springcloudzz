package com.service;

import com.config.FeignClientConfig;
import com.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 2019/12/3.
 */
@FeignClient(name = "SC-FEIGN-PRODUCT",configuration = FeignClientConfig.class)
public interface IProductClientService {

    @RequestMapping("/prodcut/get/{id}")
    public Product getProduct(@PathVariable("id")long id);
}
