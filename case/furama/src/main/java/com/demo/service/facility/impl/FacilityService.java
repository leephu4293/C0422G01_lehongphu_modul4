package com.demo.service.facility.impl;

import com.demo.model.facility.Facility;
import com.demo.repository.IFacilityRepository;
import com.demo.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return  this.iFacilityRepository.findAll(pageable);
    }

    @Override
    public void save(Facility facility) {
        this.iFacilityRepository.save(facility);
    }

    @Override
    public Facility findById(int id) {
        return this.iFacilityRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        this.iFacilityRepository.deleteById(id);
    }

    @Override
    public Page<Facility> findAllByNameContaining(String name, Pageable pageable) {
        return this.iFacilityRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public Page<Facility> findByNameContainingAndTypeServiceId(String name, Integer id, Pageable pageable) {
        Page<Facility> page = null;
        if (id == 0){
            page = this.iFacilityRepository.findAllByNameContaining(name,pageable);
        }else {
            page= this.iFacilityRepository.findByNameContainingAndTypeServiceId(name,id,pageable);
        }
        return page;
    }

}
