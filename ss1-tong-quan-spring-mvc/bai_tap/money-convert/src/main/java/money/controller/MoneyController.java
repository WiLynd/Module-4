package money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyController {
    @GetMapping("/")
    public String money() {
        return "index";
    }
    @PostMapping("/")
    public String calculator(@RequestParam double vnd, double usd, Model model) {
        double result = vnd * usd;
        model.addAttribute("result",result);
        return "index";
    }
}
