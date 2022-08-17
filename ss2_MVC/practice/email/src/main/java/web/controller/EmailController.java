package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.IEmailService;

@Controller
public class EmailController {

    @Autowired
    IEmailService iEmailService;

    @GetMapping("/")
    public  String home (){
        return "home";
    }

    @GetMapping("/email")
    public  String email(@RequestParam String str , Model model){
        boolean check = this.iEmailService.checkEmail(str);
        if (check){
            model.addAttribute("mess","email dung dinh dang");
        } else {
            model.addAttribute("mess","email khong dung dinh dang");
        }
        return "home";
    }
}
