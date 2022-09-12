package com.demo.controller;


import com.demo.model.Contract;

import com.demo.service.Contract.IContractService;
import com.demo.service.IContractDTOs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ContractController {
    @Autowired
    private IContractService contractService;

    @GetMapping("/contract")
    public String showList (Model model, Pageable pageable){
        Page<Contract> page= this.contractService.findByDayEndGreaterThan(String.valueOf(LocalDate.now()),pageable);
        List<IContractDTOs> contractList = this.contractService.showTotal();
        model.addAttribute("contracts",  contractList);
        return "/contract/listContract";
    }



}
