package com.books.repository;

import com.books.model.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBooksRepository extends JpaRepository<Books,Integer> {

}
