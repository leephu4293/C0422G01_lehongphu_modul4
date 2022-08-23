package com.blog.controller;

import com.blog.model.Blog;
import com.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("/")
    public String home(Model model) {
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blog", blogList);
        return "home";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("blogUpdate", this.blogService.findById(id));
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
        return "create";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Blog blog) {
        this.blogService.save(blog);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int take) {
        this.blogService.deleteById(take);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("details", this.blogService.findById(id));
        return "detail";
    }
}
