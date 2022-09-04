package com.demo.service.customer.impl;

import com.demo.model.customer.Customer;
import com.demo.repository.ICustomerRepository;
import com.demo.service.customer.ICustomerService;
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
        this.iCustomerRepository.deleteById(id);
    }



    @Override
    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
        return this.iCustomerRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public Page<Customer> findByNameContainingAndIdContaining(String name, String id, Pageable pageable) {
        Page<Customer> customerPage= null;
        if (id.equals("")){
            customerPage =this.iCustomerRepository.findAllByNameContaining(name,pageable);
        }else {
            customerPage = this.iCustomerRepository.findByNameContainingAndIdContaining(name,id,pageable);
        }
        return customerPage;
    }


}
