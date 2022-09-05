package com.blog.repository;

import com.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findAllByCategory_IdCategory(int id, Pageable pageable);
    Page<Blog> findByNameContainingAndCategory_IdCategory(String name, Integer id, Pageable pageable);

}
