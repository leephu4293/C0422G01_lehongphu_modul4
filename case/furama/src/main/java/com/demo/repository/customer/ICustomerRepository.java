package com.demo.repository.customer;

import com.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByNameContaining(String name , Pageable pageable);
    Page<Customer> findByNameContainingAndIdContaining(String name , String id, Pageable pageable);
}
