package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ICurrencyService;

@Controller
public class CurrencyController {
    @Autowired
    ICurrencyService iCurrencyService;

    @GetMapping("/")
    public String home (){
        return "/display";
    }

    @GetMapping("/result")
    public String sumMoney (@RequestParam double number , Model model){
       double total = iCurrencyService.changeCurrency(number);
       model.addAttribute("total",total);
        return "/display";
    }
}
