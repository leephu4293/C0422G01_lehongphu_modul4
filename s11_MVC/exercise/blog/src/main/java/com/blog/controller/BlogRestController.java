package com.blog.controller;

import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.service.IBlogService;
import com.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/restController")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;


    @GetMapping("/listCategory")
    public ResponseEntity<List<Category>> getCategory() {
        List<Category> page = this.categoryService.findAll();
        if (page.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(page, HttpStatus.OK);
    }

    @GetMapping("/listBlog")
    public ResponseEntity<Page<Blog>> getBlog(@PageableDefault(value = 2) Pageable pageable) {
        Page<Blog> page = this.blogService.findAlḷ(pageable);
        if (!page.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(page, HttpStatus.OK);
    }

    @GetMapping ("/findBlog")
    public ResponseEntity<Page<Blog>> getId(@RequestParam int id, @PageableDefault(value = 2) Pageable pageable){
        Page<Blog> page = this.blogService.findAllByCategory_IdCategory(id, pageable);
        if (!page.hasContent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(page,HttpStatus.OK);
    }

    @GetMapping("/detailsBlog/{id}")
    public ResponseEntity<Blog> details(@PathVariable Integer id){
        Blog blog = this.blogService.findById(id);
        if (blog == null ){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }


}