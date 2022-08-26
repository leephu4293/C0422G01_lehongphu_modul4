package com.books.controller;


import com.books.model.Books;
import com.books.model.Dto.BooksDto;
import com.books.service.IBooksService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;


@Controller
public class BooksController {

    @Autowired
    private IBooksService iBooksService;

    @GetMapping("/")
    private String home(Model model, Pageable pageable){
      model.addAttribute("pageBooks", this.iBooksService.findAll(pageable));
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String details(Model model, @PathVariable int id){
        Books books = this.iBooksService.findById(id);
        BooksDto booksDto = new BooksDto();
        BeanUtils.copyProperties(books,booksDto);
        model.addAttribute("booksDto",booksDto);
        return "detail";
    }

    @PostMapping("/update")
    public String borrow(@ModelAttribute BooksDto booksDto,
                         RedirectAttributes redirectAttributes) throws Exception {
        int id = booksDto.getId();
       Books books = this.iBooksService.findById(id);
       if (books.getCounts()==0){
           throw new Exception();
       }
       books.setCounts(booksDto.getCounts()-1);
       this.iBooksService.save(books);
       redirectAttributes.addFlashAttribute("msg","Dang Ky Muon Thanh Cong");
        return "redirect:/detail/"+id;
    }

    @PostMapping("/give")
    public String giveBack(@RequestParam Optional <Integer> giveId,RedirectAttributes redirectAttributes) throws Exception {
        int idCheck = giveId.orElse(0);
        Books books = this.iBooksService.findById(idCheck);

        if (books==null){
            redirectAttributes.addFlashAttribute("msg","id khong ton tai ");
            throw new Exception();
        }

       if(books.getCounts()<books.getCheckNumber()){
           books.setCounts(books.getCounts()+1);
           this.iBooksService.save(books);
       }
        return "redirect:/";
    }

    @GetMapping("/show")
    public  String showGive(){
        return "giveBack";
    }


    @ExceptionHandler(value = Exception.class)
    public String goErrors(){
        return "BookErr";
    }

}
