package com.controller;

import com.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by root on 2019/12/2.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    public static final String PRODUCT_GET_URL = "http://SC-EUREKA-PROVIDER-PRODUCT-APPNME/product/get/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    @RequestMapping("/get/{id}")
    public Object get(@PathVariable("id")long id) {
        //加入了用户名密码的验证
        Product product = restTemplate.exchange(PRODUCT_GET_URL+id, HttpMethod.GET,
                new HttpEntity<Object>(httpHeaders),Product.class).getBody();
        return product;
    }


}
