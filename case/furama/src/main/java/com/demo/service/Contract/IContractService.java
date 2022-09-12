package com.demo.service.Contract;

import com.demo.model.Contract;
import com.demo.service.IContractDTOs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contract> findByDayEndGreaterThan (String day, Pageable pageable);
    List<IContractDTOs> showTotal();
}
