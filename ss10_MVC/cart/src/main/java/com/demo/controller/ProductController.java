package com.demo.controller;


import com.demo.model.Product;
import com.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;
import java.util.Map;

@SessionAttributes(value = "cartShop")
@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cartShop")
    public Map<Product,Integer> createShop(){
        Map<Product,Integer> mapPro = new HashMap<>();
        return mapPro;
    }

    @GetMapping("/")
    public String home (Model model){
        model.addAttribute("listProduct",this.productService.findAll());
        return "home";
    }


}
