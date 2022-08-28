package com.demo.service;

import com.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save (Customer customer);
    Customer findById(int id);
    void deleteById(int id);
}
