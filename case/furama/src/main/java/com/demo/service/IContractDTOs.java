package com.demo.service;

import com.demo.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractDTOs{
    String getNameService();
    String getNameCustomer();
    String getDayStartDTOs();
    String getDayEndDTOs();
    Double getDepositDTOs();
    Double getTotalDTOS();
    Integer getIdContract();


}
