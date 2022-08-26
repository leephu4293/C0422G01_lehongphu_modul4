package com.books.service;

import com.books.model.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBooksService {
    Page<Books> findAll(Pageable pageable);
    Books findById(int id);
    void save(Books books);
}
