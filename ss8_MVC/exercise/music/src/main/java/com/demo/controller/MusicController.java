package com.demo.controller;

import com.demo.model.Dto.MusicDto;
import com.demo.model.Music;
import com.demo.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("/")
    public String home (Model model, Pageable pageable){
        Page<Music> musicPage=this.iMusicService.findAll(pageable);
        model.addAttribute("pageMusic",musicPage);
        return "home";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("musicDto",new MusicDto());
        return "create";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute @Valid MusicDto musicDto, BindingResult bindingResult){
        Music music = new Music();
        if (bindingResult.hasErrors()){
            return "create";
        }else {
            BeanUtils.copyProperties(musicDto,music);
            this.iMusicService.save(music);
         return "redirect:/";
        }
    }
    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable int id){
        Music music = this.iMusicService.findById(id);
        MusicDto musicDto = new MusicDto();
        BeanUtils.copyProperties(music,musicDto);
        model.addAttribute("musicDto",musicDto);
        return "update";
    }
    @PostMapping("/edit")
    public String update(@ModelAttribute @Valid MusicDto musicDto,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "update";
        }else {
            Music music = new Music(musicDto.getId(),musicDto.getName(),musicDto.getSinger(),musicDto.getType());
            this.iMusicService.save(music);
        return "redirect:/";
    }
    }
}
