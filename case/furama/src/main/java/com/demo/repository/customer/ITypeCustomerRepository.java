package com.demo.repository.customer;

import com.demo.model.customer.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITypeCustomerRepository extends JpaRepository<TypeCustomer,Integer> {
}
