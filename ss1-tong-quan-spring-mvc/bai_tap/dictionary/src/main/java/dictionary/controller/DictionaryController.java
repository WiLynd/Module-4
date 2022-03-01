package dictionary.controller;

import dictionary.repository.DictionaryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class DictionaryController {
    DictionaryRepository dictionaryRepository = new DictionaryRepository();
    Map<String,String> map = dictionaryRepository.dictionary();

    @GetMapping
    public String home() {
        return "index";
    }

    @PostMapping
    public String result(@RequestParam String input, Model model) {
        for (Map.Entry<String,String> mapList : map.entrySet()) {
            if (mapList.getKey().toLowerCase().equals(input.toLowerCase())) {
                String result = mapList.getValue();
                model.addAttribute("result",result);
            }
            else {
                model.addAttribute("message", "Word not found");
            }
        }
        return "index";
    }
}
