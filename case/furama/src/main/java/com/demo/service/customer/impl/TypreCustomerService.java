package com.demo.service.customer.impl;

import com.demo.model.customer.TypeCustomer;
import com.demo.repository.ITypeCustomerRepository;
import com.demo.service.customer.ITypeCustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TypreCustomerService implements ITypeCustomerService {
    @Autowired
    private ITypeCustomerRepository iTypeCustomerRepository;


    @Override
    public List<TypeCustomer> findAll() {
        return this.iTypeCustomerRepository.findAll();
    }
}
