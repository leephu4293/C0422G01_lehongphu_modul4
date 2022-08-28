package com.demo.repository;

import com.demo.model.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITypeCustomerRepository extends JpaRepository<TypeCustomer,Integer> {
}
