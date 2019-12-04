package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 2019/12/4.
 */
@FeignClient(name = "SC-EUREKA-PROVIDER-PRODUCT-APPNME",configuration = FeignClient.class)
public interface IProductService {

    @RequestMapping("/get/{id}")
    public Object get(@PathVariable("id")long id);
}
