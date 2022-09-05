package com.example.phone.service;

import com.example.phone.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPhoneService {
    Page<Phone> findAll(Pageable pageable);
    void  save (Phone phone);
     void deleteById (Integer id);
     Phone findById(Integer id);

}
