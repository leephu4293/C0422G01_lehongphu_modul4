package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.service.ICalculatorService;


@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String home (){
        return "home";
    }

    @GetMapping("/calculator")
    public String result(@RequestParam double number1, @RequestParam double number2,
                       @RequestParam String select, Model model){
       String result = this.iCalculatorService.calculator(number1,number2,select);
       model.addAttribute("result",result);
        return "home";
    }
}
