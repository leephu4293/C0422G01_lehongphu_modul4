package com.form.controller;

import com.form.common.CheckValidate;
import com.form.model.UserFrom;
import com.form.model.Dto.UserFromDto;
import com.form.service.IUserFormService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserFromController {
    @Autowired
    private IUserFormService userFormService;

    @GetMapping("/")
    public String home(Model model, Pageable pageable) {
        Page<UserFrom> userFroms = this.userFormService.findAll(pageable);
        model.addAttribute("pageDivine",userFroms);
        return "home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("userFromDto", new UserFromDto());
        return "create";
    }


    @PostMapping("/add")
    public String add(@ModelAttribute("userFromDto") @Valid UserFromDto userFromDto, BindingResult bindingResult) {
        UserFrom userFrom = new UserFrom();
        String str = userFromDto.getAge();
        new CheckValidate().validate(userFromDto, bindingResult);
            if (bindingResult.hasErrors()) {
                return "create";
            }
                BeanUtils.copyProperties(userFromDto, userFrom);
                userFrom.setAge(str);
                this.userFormService.save(userFrom);
                return "redirect:/";
    }

}
