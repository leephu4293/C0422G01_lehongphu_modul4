package com.demo.controller;


import com.demo.model.customer.Customer;
import com.demo.model.customer.TypeCustomer;
import com.demo.service.customer.ICustomerService;
import com.demo.service.customer.ITypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ITypeCustomerService iTypeCustomerService;

    @GetMapping("/customer")
    public String showList(Model model, Pageable pageable) {
        Page<Customer> page = this.customerService.findAll(pageable);
        model.addAttribute("pageCustomer", page);
        return "/customer/listCustomer";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        List<TypeCustomer> list = this.iTypeCustomerService.findAll();
        model.addAttribute("listType", list);
        model.addAttribute("create", new Customer());
        return "/customer/createCustomer";
    }

    @PostMapping("/addCustomer")
    public String add(@ModelAttribute Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/updateCustomer/{id}")
    public String showUpdate(Model model, @PathVariable int id) {
        Customer customer = this.customerService.findById(id);
        List<TypeCustomer> list = this.iTypeCustomerService.findAll();
        model.addAttribute("listType", list);
        model.addAttribute("customerUpdate", customer);
        return "/customer/updateCustomer";
    }

    @PostMapping("/updateCustomer")
    public String update(@ModelAttribute Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/deleteCustomer")
    public String delete(@RequestParam int deleteModal) {
        this.customerService.deleteById(deleteModal);
        return "redirect:/customer";
    }
}
