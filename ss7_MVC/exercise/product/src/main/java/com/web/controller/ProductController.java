package com.web.controller;

import com.web.model.Product;
import com.web.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping({"/", "/search"})
    public String home(Model model,
                       @PageableDefault(value = 2, sort = "name", direction = Sort.Direction.DESC) Pageable pageable,
                       @RequestParam Optional<String> findBlog) {
        String str = findBlog.orElse("");
        Page<Product> productPage = this.iProductService.findByNameContaining(str, pageable);
        model.addAttribute("keySearch", str);
        model.addAttribute("pageHome", productPage);
        return "home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("products", new Product());
        return "create";
    }

    @PostMapping("/add")
    public String create(@ModelAttribute Product product) {
        this.iProductService.save(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable int id) {
        model.addAttribute("products", this.iProductService.findById(id));
        return "update";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Product product) {
        this.iProductService.save(product);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id) {
        model.addAttribute("details", this.iProductService.findById(id));
        return "detail";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int take) {
        this.iProductService.deleteByid(take);
        return "redirect:/";
    }
}
