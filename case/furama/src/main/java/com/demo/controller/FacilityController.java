package com.demo.controller;

import com.demo.Dto.FacilityDto;
import com.demo.model.facility.Facility;
import com.demo.model.facility.RentType;
import com.demo.model.facility.TypeService;
import com.demo.service.facility.IFacilityService;
import com.demo.service.facility.IRentService;
import com.demo.service.facility.ITypeServiceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IRentService rentService;
    @Autowired
    private ITypeServiceService iTypeServiceService;

    @GetMapping("/facilityList")
    public String showFacility(Model model,
                               @PageableDefault(value = 2) Pageable pageable,
                               @RequestParam Optional<String> nameSearch,
                               @RequestParam Optional<Integer> typeSearch) {
        String str = nameSearch.orElse("");
        Integer id = typeSearch.orElse(0);
        Page<Facility> page = this.facilityService.findByNameContainingAndTypeServiceId(str,id,pageable);
        model.addAttribute("idType",id);
        model.addAttribute("nameType",str);
        List<TypeService> typeServiceList = this.iTypeServiceService.findAll();
        model.addAttribute("typeList", typeServiceList);
        model.addAttribute("pageFac", page);
        return "/facility/listFacility";
    }

    @GetMapping("/createFacility")
    public String showCreateFacility(Model model) {
        List<RentType> rentTypeList = this.rentService.findAll();
        List<TypeService> typeServiceList = this.iTypeServiceService.findAll();
        model.addAttribute("typeList", typeServiceList);
        model.addAttribute("facilityDto", new FacilityDto());
        model.addAttribute("rentList", rentTypeList);
        return "/facility/createFacility";
    }

    @PostMapping("/addFromFacility")
    public String createFacility(@ModelAttribute @Valid FacilityDto facilityDto,
                                 BindingResult bindingResult,Model model) {
        Facility facility = new Facility();
        if (bindingResult.hasErrors()){
            List<TypeService> typeServiceList = this.iTypeServiceService.findAll();
            List<RentType> rentTypeList = this.rentService.findAll();
            model.addAttribute("typeList", typeServiceList);
            model.addAttribute("rentList", rentTypeList);
            return "/facility/createFacility";
        }
        BeanUtils.copyProperties(facilityDto,facility);
        this.facilityService.save(facility);
        return "redirect:/facilityList";
    }

    @GetMapping("/updateFacility/{id}")
    public String showUpdateFac(Model model, @PathVariable int id) {
        List<RentType> rentTypeList = this.rentService.findAll();
        List<TypeService> typeServiceList = this.iTypeServiceService.findAll();
        FacilityDto facilityDto = new FacilityDto();
        BeanUtils.copyProperties( this.facilityService.findById(id),facilityDto);
        model.addAttribute("typeList", typeServiceList);
        model.addAttribute("facilityDto", facilityDto);
        model.addAttribute("rentList", rentTypeList);
        return "/facility/update";
    }

    @PostMapping("/updateFrom")
    public String updateFrom(@ModelAttribute @Valid FacilityDto facilityDto,BindingResult bindingResult,
                             Model model) {
        Facility facility = new Facility();
        if (bindingResult.hasErrors()){
            List<RentType> rentTypeList = this.rentService.findAll();
            List<TypeService> typeServiceList = this.iTypeServiceService.findAll();
            model.addAttribute("typeList", typeServiceList);
            model.addAttribute("rentList", rentTypeList);
            return "/facility/update";
        }
        BeanUtils.copyProperties(facilityDto,facility);
        this.facilityService.save(facility);
        return "redirect:/facilityList";
    }



    @GetMapping("/deleteFacility")
    public String deleteForm(@RequestParam int throwId){
        this.facilityService.deleteById(throwId);
        return "redirect:/facilityList";
    }
}
