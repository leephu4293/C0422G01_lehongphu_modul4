package com.demo.service;

import com.demo.model.ContractDetails;

import java.util.List;

public interface IContractDetailsService {
    List<ContractDetails> findByContract_IdContract (Integer id);
}
