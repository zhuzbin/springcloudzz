package com.service;

import com.entity.Product;

import java.util.List;

/**
 * Created by root on 2019/12/2.
 */
public interface IProductService {
    Product get(long id);

    List<Product> list();
}
