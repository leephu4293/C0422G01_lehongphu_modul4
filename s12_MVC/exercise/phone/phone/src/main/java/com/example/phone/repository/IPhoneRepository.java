package com.example.phone.repository;

import com.example.phone.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepository extends JpaRepository<Phone,Integer> {

}
