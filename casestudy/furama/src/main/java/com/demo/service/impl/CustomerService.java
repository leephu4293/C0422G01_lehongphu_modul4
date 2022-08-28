package com.demo.service.impl;

import com.demo.model.Customer;
import com.demo.repository.ICustomerRepository;
import com.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService  implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return this.iCustomerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return this.iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        this.iCustomerRepository.findById(id);
    }


}
