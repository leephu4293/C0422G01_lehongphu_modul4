package com.demo.controller;

import com.demo.model.Product;
import com.demo.service.ICartService;
import com.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@Controller
public class SessionController {
    @Autowired
    private IProductService productService;
    @Autowired
    private ICartService cartService;
    @GetMapping("/addSession/{id}")
    public String showCart(@PathVariable int id, @SessionAttribute () Map<Product,Integer> cartShop, Model model){
        Product product = this.productService.findById(id);
        Integer count = 1;
       if (cartShop.containsKey(product)){
             cartShop.replace(product, cartShop.get(product)+1);
       }else {
           cartShop.put(product,count);
       }
        double total = this.cartService.total(cartShop);
        model.addAttribute("total",total);
           model.addAttribute("mapProduct",cartShop);

        return "listCart";
    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable int id,@SessionAttribute Map<Product,Integer> cartShop,Model model){
        Product product = this.productService.findById(id);
        cartShop.remove(product);
        model.addAttribute("mapProduct",cartShop);
        return "listCart";
    }
    @PostMapping("/update")
    public String update(@RequestParam int update,@RequestParam int idUpdate,
                         @SessionAttribute Map<Product,Integer> cartShop,Model model){
        Product product = this.productService.findById(idUpdate);
        cartShop.replace(product,update);
        double total = this.cartService.total(cartShop);
        model.addAttribute("total",total);
        model.addAttribute("mapProduct",cartShop);
        return "listCart";
    }
    @GetMapping("/details/{id}")
    public String details(@PathVariable int id,Model model){
        Product product = this.productService.findById(id);
        model.addAttribute("detail",product);
        return "details";
    }
}
