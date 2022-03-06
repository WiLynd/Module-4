package dictionary.controller;

import dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/search")
    public String result(String input, Model model) {
        String word = iDictionaryService.translate(input);
        model.addAttribute("result",word);
        return "index";
    }
}
