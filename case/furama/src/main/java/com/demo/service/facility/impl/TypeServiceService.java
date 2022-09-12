package com.demo.service.facility.impl;

import com.demo.model.facility.TypeService;
import com.demo.repository.Facilities.ITypeServiceRepository;
import com.demo.service.facility.ITypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceService implements ITypeServiceService {
    @Autowired
    private ITypeServiceRepository iTypeServiceRepository;
    @Override
    public List<TypeService> findAll() {
        return this.iTypeServiceRepository.findAll();
    }
}
