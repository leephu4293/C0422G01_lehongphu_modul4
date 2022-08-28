package com.demo.controller;

import com.demo.model.facility.Facility;
import com.demo.model.facility.RentType;
import com.demo.model.facility.TypeService;
import com.demo.service.facility.IFacilityService;
import com.demo.service.facility.IRentService;
import com.demo.service.facility.ITypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IRentService rentService;
    @Autowired
    private ITypeServiceService iTypeServiceService;

    @GetMapping("/facilityList")
    public String showFacility(Model model, Pageable pageable) {
        Page<Facility> page = this.facilityService.findAll(pageable);
        model.addAttribute("pageFac", page);
        return "/facility/listFacility";
    }

    @GetMapping("/createFacility")
    public String showCreateFacility(Model model) {
        List<RentType> rentTypeList = this.rentService.findAll();
        List<TypeService> typeServiceList = this.iTypeServiceService.findAll();
        model.addAttribute("typeList", typeServiceList);
        model.addAttribute("createFacility", new Facility());
        model.addAttribute("rentList", rentTypeList);
        return "/facility/createFacility";
    }

    @PostMapping("/addFromFacility")
    public String createFacility(@ModelAttribute Facility facility) {
        this.facilityService.save(facility);
        return "redirect:/facilityList";
    }

    @GetMapping("/updateFacility/{id}")
    public String showUpdateFac(Model model, @PathVariable int id) {
        List<RentType> rentTypeList = this.rentService.findAll();
        List<TypeService> typeServiceList = this.iTypeServiceService.findAll();
        model.addAttribute("typeList", typeServiceList);
        model.addAttribute("createFacility", this.facilityService.findById(id));
        model.addAttribute("rentList", rentTypeList);
        return "/facility/update";
    }

    @PostMapping("/updateFrom")
    public String updateFrom(@ModelAttribute Facility facility) {
        this.facilityService.save(facility);
        return "redirect:/facilityList";
    }



    @GetMapping("/deleteFacility")
    public String deleteForm(@RequestParam int throwId){
        this.facilityService.deleteById(throwId);
        return "redirect:/facilityList";
    }
}
