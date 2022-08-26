package com.books.service.impl;

import com.books.model.Books;
import com.books.repository.IBooksRepository;
import com.books.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BooksService implements IBooksService {
    @Autowired
    private IBooksRepository iBooksRepository;


    @Override
    public Page<Books> findAll(Pageable pageable) {
        return this.iBooksRepository.findAll(pageable);
    }

    @Override
    public Books findById(int id) {
        return this.iBooksRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Books books) {
        this.iBooksRepository.save(books);
    }
}
