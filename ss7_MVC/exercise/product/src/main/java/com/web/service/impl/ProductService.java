package com.web.service.impl;

import com.web.model.Product;
import com.web.repository.IProductRepository;
import com.web.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return this.iProductRepository.findById(id).orElse(new Product());
    }

    @Override
    public void deleteByid(int id) {
        this.iProductRepository.deleteById(id);
    }

    @Override
    public Page<Product> findByNameContaining(String name, Pageable pageable) {
        return this.iProductRepository.findByNameContaining(name, pageable);
    }

}
