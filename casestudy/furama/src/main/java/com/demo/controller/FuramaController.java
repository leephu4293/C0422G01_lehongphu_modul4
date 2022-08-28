package com.demo.controller;

import com.demo.model.customer.Customer;
import com.demo.model.customer.TypeCustomer;
import com.demo.model.facility.Facility;
import com.demo.model.facility.RentType;
import com.demo.model.facility.TypeService;
import com.demo.service.customer.ICustomerService;
import com.demo.service.facility.IRentService;
import com.demo.service.facility.IFacilityService;
import com.demo.service.customer.ITypeCustomerService;
import com.demo.service.facility.ITypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FuramaController {
    @GetMapping("/")
    public String home (){
        return "home";
    }

}
