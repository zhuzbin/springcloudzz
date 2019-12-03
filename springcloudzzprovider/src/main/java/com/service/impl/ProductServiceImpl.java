package com.service.impl;

import com.entity.Product;
import com.service.IProductService;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2019/12/2.
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public Product get(long id) {
        Product product = new Product();
        product.setProductId(111L);
        product.setProductName("aaaa");
        product.setProductDesc("asdasd");
        return product;
    }

    @Override
    public List<Product> list() {
        List<Product> list = new ArrayList<>();
        Product product = new Product();
        product.setProductId(111L);
        product.setProductName("aaaa");
        product.setProductDesc("asdasd");
        list.add(product);
        return list;
    }
}
