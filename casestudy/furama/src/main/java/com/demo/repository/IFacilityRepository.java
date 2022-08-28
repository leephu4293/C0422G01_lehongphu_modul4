package com.demo.repository;

import com.demo.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
}
