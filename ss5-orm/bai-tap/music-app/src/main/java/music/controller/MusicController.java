package music.controller;

import music.model.Music;
import music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping()
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Music> musicList = musicService.findAll();
        modelAndView.addObject("music", musicList);
        return modelAndView;
    }

    @GetMapping("{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("info");
        Music music = musicService.findOne(id);
        modelAndView.addObject("music", music);
        return modelAndView;
    }

    @PostMapping
    public String updateCustomer(Music music) {
        musicService.save(music);
        return "redirect:/musics";
    }
}
