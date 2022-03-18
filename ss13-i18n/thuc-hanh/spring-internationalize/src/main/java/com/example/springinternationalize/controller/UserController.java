package com.example.springinternationalize.controller;

import com.example.springinternationalize.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping
    public String login(Model model){
        model.addAttribute("user",new User());
        return "home";
    }

    @RequestMapping("/doLogin")
    public String success(@ModelAttribute User user, Model model){
        if(user.getUserName().equals("admin") && user.getPassword().equals("123456")) {
            model.addAttribute("user",user);
            return "success";
        }
        return "error";
    }
}
