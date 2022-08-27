package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuramaController {
    @GetMapping("/")
    public String home (){
        return "home";
    }

    @GetMapping("/customer")
    public String showList(){
        return "/customer/listCustomer";
    }
}
