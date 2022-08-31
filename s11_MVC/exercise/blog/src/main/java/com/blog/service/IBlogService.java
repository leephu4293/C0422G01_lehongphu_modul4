package com.blog.service;

import com.blog.model.Blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;




public interface IBlogService {
    Blog findById(Integer id);
    void save(Blog blog);
    void deleteById(Integer id);
    Page<Blog> findAlḷ(Pageable pageable);
    Page<Blog> findByNameContainingAndCategory_IdCategory(String name,Integer id, Pageable pageable);
    Page<Blog> findAllByCategory_IdCategory(int id, Pageable pageable);
}
