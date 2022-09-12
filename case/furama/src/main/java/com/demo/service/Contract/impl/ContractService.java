package com.demo.service.Contract.impl;

import com.demo.model.Contract;
import com.demo.repository.IContractRepository;
import com.demo.service.Contract.IContractService;
import com.demo.service.IContractDTOs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<Contract> findByDayEndGreaterThan (String day, Pageable pageable) {
        return this.iContractRepository.findByDayEndGreaterThan(day,pageable);
    }

    @Override
    public List<IContractDTOs> showTotal() {
        return this.iContractRepository.showTotal();
    }


}
