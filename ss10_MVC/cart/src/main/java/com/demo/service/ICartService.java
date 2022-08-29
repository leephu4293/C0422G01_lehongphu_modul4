package com.demo.service;

import com.demo.model.Product;

import java.util.Map;

public interface ICartService {
    public double total(Map<Product,Integer> cartShop);
}
