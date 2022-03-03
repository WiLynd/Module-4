package setting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import setting.model.Setting;

@Controller
public class SettingController {

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home","setting", new Setting());
        return modelAndView;
    }

    @PostMapping(value = "/submit")
    public String showSetting(@ModelAttribute("setting")Setting setting, Model model) {
        model.addAttribute("languages", setting.getLanguages());
        model.addAttribute("pageSize", setting.getPageSize());
        model.addAttribute("spamsFilter", setting.getSpamsFilter());
        model.addAttribute("signature", setting.getSignature());
        return "info";
    }
}
