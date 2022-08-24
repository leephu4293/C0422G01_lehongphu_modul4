package com.web.service;

import com.web.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    void save(Product product);

    Product findById(Integer id);

    void deleteByid(int id);

    Page<Product> findByNameContaining(String name, Pageable pageable);
}
