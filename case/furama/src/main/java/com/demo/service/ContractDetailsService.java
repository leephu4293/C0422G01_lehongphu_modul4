package com.demo.service;


import com.demo.model.ContractDetails;
import com.demo.repository.IContractDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContractDetailsService implements IContractDetailsService {
    @Autowired
    IContractDetailsRepository iContractDetailsRepository;
    @Override
    public List<ContractDetails> findByContract_IdContract(Integer id) {
        return this.iContractDetailsRepository.findByContract_IdContract(id);
    }
}
