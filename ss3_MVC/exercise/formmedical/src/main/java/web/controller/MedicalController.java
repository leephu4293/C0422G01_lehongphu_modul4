package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Medical;
import web.service.IMedicalService;

import java.util.List;

@Controller
public class MedicalController {
    @Autowired
    private IMedicalService iMedicalService;

    @GetMapping("/")
    public String home(Model model){
        List<String> listDay = this.iMedicalService.day();
        List<String> listMonth = this.iMedicalService.month();
        List<String> listGender= this.iMedicalService.gender();
        List<String> listYear = this.iMedicalService.year();
        List<String> listNation = this.iMedicalService.nation();
        List<String> listTravel = this.iMedicalService.travel();
        model.addAttribute("day",listDay);
        model.addAttribute("travel",listTravel);
        model.addAttribute("month",listMonth);
        model.addAttribute("year",listYear);
        model.addAttribute("gender",listGender);
        model.addAttribute("nation",listNation);
        model.addAttribute("medical",new Medical());
        return "home";
    }


    public String create (){
        return "display";
    }
}
