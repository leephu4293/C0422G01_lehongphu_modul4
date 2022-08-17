package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.Medical;
import web.service.IMedicalService;

import java.util.List;

@Controller
public class MedicalController {
    @Autowired
    private IMedicalService iMedicalService;

    @GetMapping("/")
    public String home(Model model) {
        List<String> listDay = this.iMedicalService.day();
        List<String> listMonth = this.iMedicalService.month();
        List<String> listGender = this.iMedicalService.gender();
        List<String> listYear = this.iMedicalService.year();
        List<String> listNation = this.iMedicalService.nation();
        List<String> listTravel = this.iMedicalService.travel();
        model.addAttribute("day", listDay);
        model.addAttribute("travel", listTravel);
        model.addAttribute("month", listMonth);
        model.addAttribute("year", listYear);
        model.addAttribute("gender", listGender);
        model.addAttribute("nation", listNation);
        model.addAttribute("medical", new Medical());
        return "home";
    }

    @GetMapping("/create")
    public String create(Medical medical, Model model) {
        this.iMedicalService.save(medical);
        return "home";
    }

    @GetMapping("/show")
    public String show(Model model) {
        List<Medical> medicalList = this.iMedicalService.display();
        model.addAttribute("list", medicalList);
        return "display";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable String id) {
        List<String> listDay = this.iMedicalService.day();
        List<String> listMonth = this.iMedicalService.month();
        List<String> listGender = this.iMedicalService.gender();
        List<String> listYear = this.iMedicalService.year();
        List<String> listNation = this.iMedicalService.nation();
        List<String> listTravel = this.iMedicalService.travel();
        model.addAttribute("day", listDay);
        model.addAttribute("travel", listTravel);
        model.addAttribute("month", listMonth);
        model.addAttribute("year", listYear);
        model.addAttribute("gender", listGender);
        model.addAttribute("nation", listNation);
        Medical medical1 = this.iMedicalService.find(id);
        model.addAttribute("medical", medical1);
        return "edit";
    }

    @PostMapping("/edit")
    public String update(Model model, Medical medical) {
        this.iMedicalService.update(medical);
        return "redirect:/show";
    }
}
