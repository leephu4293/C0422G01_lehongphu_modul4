package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.ITimeService;

import java.util.Date;

@Controller
public class TimeController {
    @Autowired
   private ITimeService iTimeService;
   @GetMapping("/time")
    public String time(String city, Model model){
       Date check = this.iTimeService.Time(city);
       model.addAttribute("city", city);
       model.addAttribute("date", check);
       return "index";
   }

   @GetMapping("/")
   public String homẹ(){
       return "index";
   }


}
