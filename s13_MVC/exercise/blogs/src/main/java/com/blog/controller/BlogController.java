package com.blog.controller;

import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.service.IBlogService;
import com.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping({"/home", "/search"})
    public String divine(@PageableDefault(value = 2, sort = "name") Pageable pageable, Model model,
                         @RequestParam Optional<String> findBlog,
                         @RequestParam Optional<Integer> searchCategory) {
        String str = findBlog.orElse("");
        Integer id = searchCategory.orElse(0);
        List<Category> categoryList = this.categoryService.findAll();
        model.addAttribute("category", categoryList);
        model.addAttribute("keySearch", str);
        model.addAttribute("idSearch", id);
        Page<Blog> blogPage = this.blogService.findByNameContainingAndCategory_IdCategory(str, id, pageable);
        model.addAttribute("divine", blogPage);
        return "home";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("blogUpdate", this.blogService.findById(id));
        List<Category> categoryList = this.categoryService.findAll();
        model.addAttribute("category", categoryList);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog) {
        this.blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blogCreate", new Blog());
        List<Category> categoryList = this.categoryService.findAll();
        model.addAttribute("category", categoryList);
        return "create";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Blog blog) {
        this.blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int take) {
        this.blogService.deleteById(take);
        return "redirect:/home";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("details", this.blogService.findById(id));
        return "detail";
    }


}
