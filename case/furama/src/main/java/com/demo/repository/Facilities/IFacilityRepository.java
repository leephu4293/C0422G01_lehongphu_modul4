package com.demo.repository.Facilities;

import com.demo.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
     Page<Facility> findAllByNameContaining(String name, Pageable pageable);
     Page<Facility> findByNameContainingAndTypeServiceId(String name,Integer id, Pageable pageable );
}
