package com.demo.repository;

import com.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
