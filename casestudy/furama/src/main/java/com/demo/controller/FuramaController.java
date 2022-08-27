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
    @GetMapping("/create")
    public String showCreate(){
        return "/customer/createCustomer";
    }
    @GetMapping("/facilityList")
    public String showFacility(){
        return "/facility/listFacility";
    }
    @GetMapping("/createFacility")
    public String createFacility(){
        return "/facility/createFacility";
    }
    @GetMapping("/showCreateEmployee")
    public String showEmpployee(){
        return "/employee/createEmployee";
    }

}
