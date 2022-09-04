package com.demo.service.facility;

import com.demo.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);
    void save(Facility facility);
    Facility findById(int id);
    void deleteById(int id);
    Page<Facility> findAllByNameContaining(String name, Pageable pageable);
    Page<Facility> findByNameContainingAndTypeServiceId(String name,Integer id, Pageable pageable );
}
