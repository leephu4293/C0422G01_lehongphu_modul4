package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import web.model.Email;
import web.service.IEmailService;

import java.util.List;

@Controller
public class EmailController {
    @Autowired
    private IEmailService iEmailService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("email", new Email());
        List<String> list = iEmailService.language();
        List<String> listSize = iEmailService.pageSize();
        model.addAttribute("language", list);
        model.addAttribute("size", listSize);
        return "home";
    }

    @GetMapping("/create")
    public String create(@ModelAttribute Email email, Model model) {
        model.addAttribute("email", email);
        return "display";
    }
}
