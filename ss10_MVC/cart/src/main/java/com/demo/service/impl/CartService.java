package com.demo.service.impl;

import com.demo.model.Product;
import com.demo.service.ICartService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class CartService implements ICartService {

    @Override
    public double total(Map<Product, Integer> cartShop) {
        double total = 0.0;
        Set<Product> set= cartShop.keySet();
        for (Product set1 : set){
            total+= (Double.parseDouble(set1.getPrice()) * cartShop.get(set1));
        }
        return total ;
    }
}
