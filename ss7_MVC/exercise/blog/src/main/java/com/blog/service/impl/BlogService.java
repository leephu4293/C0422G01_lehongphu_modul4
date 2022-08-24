package com.blog.service.impl;


import com.blog.model.Blog;
import com.blog.repository.IBlogRepository;
import com.blog.service.IBlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;


@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Blog findById(Integer id) {
        return this.iBlogRepository.findById(id).orElse(new Blog());
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public void deleteById(Integer id) {
        this.iBlogRepository.deleteById(id);
    }


    @Override
    public Page<Blog> findByNameContainingAndCategory_IdCategory(String name, Integer id, Pageable pageable) {
        Page<Blog> blogPage = null;
        if (id == 0) {
            blogPage = this.iBlogRepository.findAllByNameContaining(name, pageable);
        } else {
            blogPage = this.iBlogRepository.findByNameContainingAndCategory_IdCategory(name, id, pageable);
        }
        return blogPage;
    }

    @Override
    public Page<Blog> findAllByNameContaining(String name, Pageable pageable) {
        return this.iBlogRepository.findAllByNameContaining(name, pageable);
    }


}
