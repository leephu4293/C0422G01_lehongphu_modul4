package com.demo.controller;


import com.demo.model.ContractDetails;

import com.demo.service.IContractDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restController")
public class RestContractController {
   @Autowired
    IContractDetailsService contractDetailsService ;

    @GetMapping("/otherFacilities")
    public ResponseEntity<List <ContractDetails>> showList(@RequestParam Integer id ){
        List<ContractDetails> contractDetailsList = this.contractDetailsService.findByContract_IdContract(id);
          if (contractDetailsList.isEmpty()){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
          }
          return new ResponseEntity<>(contractDetailsList, HttpStatus.OK);
    }
}
