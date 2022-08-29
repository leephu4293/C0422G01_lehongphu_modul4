package com.demo.service.impl;

import com.demo.model.Product;
import com.demo.service.ICartService;
import java.util.Map;
import java.util.Set;

public class CartService implements ICartService {

    @Override
    public double total(Map<Product, Integer> cartShop) {
        double total = 0.0;
        Set<Product> set= cartShop.keySet();
        for (Product set1 : set){
            total+= set1.getPrice() * cartShop.get(set1);
        }
        return total ;
    }
}
