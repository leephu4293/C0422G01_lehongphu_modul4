package com.demo.repository;

import com.demo.model.customer.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITypeCustomerRepository extends JpaRepository<TypeCustomer,Integer> {
}
