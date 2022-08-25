package com.form.service;

import com.form.model.UserFrom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserFormService {
    Page<UserFrom> findAll(Pageable pageable);
    void save(UserFrom userFrom);
}
