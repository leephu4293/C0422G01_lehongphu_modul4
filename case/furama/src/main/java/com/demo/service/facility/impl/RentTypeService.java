package com.demo.service.facility.impl;

import com.demo.model.facility.RentType;
import com.demo.repository.Facilities.IRentTypeRepository;
import com.demo.service.facility.IRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentService {
    @Autowired
    private IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return this.iRentTypeRepository.findAll();
    }
}
