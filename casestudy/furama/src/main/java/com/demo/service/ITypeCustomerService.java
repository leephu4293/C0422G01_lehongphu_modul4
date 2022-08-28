package com.demo.service;

import com.demo.model.TypeCustomer;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ITypeCustomerService {
     List<TypeCustomer> findAll();
}
