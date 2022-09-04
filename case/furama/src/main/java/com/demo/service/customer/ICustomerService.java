package com.demo.service.customer;

import com.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save (Customer customer);
    Customer findById(int id);
    void deleteById(int id);
    Page<Customer> findAllByNameContaining(String name , Pageable pageable);
    Page<Customer> findByNameContainingAndIdContaining(String name , String id, Pageable pageable);

}
