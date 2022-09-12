package com.demo.repository;

import com.demo.model.ContractDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IContractDetailsRepository  extends JpaRepository<ContractDetails, Integer> {
    List<ContractDetails> findByContract_IdContract (Integer id);
}
