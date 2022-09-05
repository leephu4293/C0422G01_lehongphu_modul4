package com.example.phone.service;

import com.example.phone.model.Phone;
import com.example.phone.repository.IPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhoneService implements IPhoneService{
    @Autowired
    private IPhoneRepository iPhoneRepository;

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return this.iPhoneRepository.findAll(pageable);
    }

    @Override
    public void save(Phone phone) {
        this.iPhoneRepository.save(phone);
    }

    @Override
    public void deleteById(Integer id) {
        this.iPhoneRepository.deleteById(id);
    }

    @Override
    public Phone findById(Integer id) {
        return this.iPhoneRepository.findById(id).orElse(null);
    }


}
