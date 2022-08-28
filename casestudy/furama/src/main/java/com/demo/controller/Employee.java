package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Employee {

    @GetMapping("/showCreateEmployee")
    public String showEmpployee() {
        return "/employee/createEmployee";
    }
}
