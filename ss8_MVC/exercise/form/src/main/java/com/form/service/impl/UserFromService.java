package com.form.service.impl;

import com.form.model.UserFrom;
import com.form.repository.IUserFromRepository;
import com.form.service.IUserFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserFromService implements IUserFormService {
    @Autowired
    private IUserFromRepository iUserFromRepository;

    @Override
    public Page<UserFrom> findAll(Pageable pageable) {
        return this.iUserFromRepository.findAll(pageable);
    }

    @Override
    public void save(UserFrom userFrom) {
     this.iUserFromRepository.save(userFrom);
    }
}
