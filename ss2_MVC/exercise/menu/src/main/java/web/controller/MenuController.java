package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.IMenuService;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private IMenuService iMenuService;

    @GetMapping("/")
    public String home(Model model) {
        List<String> list = this.iMenuService.displayMenu();
        model.addAttribute("menu", list);
        return "home";
    }

    @GetMapping("/menu")
    public String checkMenu(@RequestParam(required = false) List<String> pick, Model model) {
        if (pick == null) {
            model.addAttribute("mess", "khong co mon chon");
        } else {
            model.addAttribute("list", pick);
        }
        List<String> list = this.iMenuService.displayMenu();
        model.addAttribute("menu", list);
        return "home";
    }

}
