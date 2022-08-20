package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Music;
import web.service.IMusicService;

import java.util.List;

@Controller
public class MusicController {

    @Autowired
    private IMusicService musicService;

    @GetMapping("/")
    public String home(Model model) {
        List<Music> list = musicService.findAll();
        model.addAttribute("list", list);
        return "home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Music music) {
        this.musicService.save(music);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model) {
        Music music = this.musicService.findByID(id);
        model.addAttribute("music", music);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Music music) {
        this.musicService.update(music);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int take) {
        Music music = this.musicService.findByID(take);
        this.musicService.delete(music);
        return "redirect:/";
    }
}
