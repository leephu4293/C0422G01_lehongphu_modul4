package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.IDictonaryService;

import java.util.Locale;

@Controller
public class Dictionnary {
    @Autowired
    IDictonaryService iDictonaryService;
    @GetMapping("/")
    public String home (){
        return "home";
    }
    @GetMapping("/home")
    public String showResult (@RequestParam String word , Model model){

        String  result = this.iDictonaryService.findWord(word.toLowerCase(Locale.ROOT));
        if (result == null){
            model.addAttribute("result","khong co tu muon dich");
        }else {
            model.addAttribute("result",result);
        }
        return "home";
    }
}
