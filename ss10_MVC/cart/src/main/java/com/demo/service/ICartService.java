package com.demo.service;

import com.demo.model.Product;

import java.util.Map;

public interface ICartService {
     double total(Map<Product,Integer> cartShop);
     void add (Map<Product,Integer> cartShop, Product product);
}
