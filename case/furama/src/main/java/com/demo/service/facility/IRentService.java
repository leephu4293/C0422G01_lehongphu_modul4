package com.demo.service.facility;

import com.demo.model.facility.RentType;

import java.util.List;

public interface IRentService {
    List<RentType> findAll();
}
