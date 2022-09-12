package com.demo.repository;

import com.demo.model.Contract;
import com.demo.service.IContractDTOs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IContractRepository extends JpaRepository<Contract, Integer> {
    Page<Contract> findByDayEndGreaterThan (String day, Pageable pageable);

    @Query(value = "call get_total()", nativeQuery = true)
    List<IContractDTOs> showTotal();


}
