package com.codegym.register.controller;

import com.codegym.register.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    UserDTO userDTO;

    @GetMapping("/form")
    public ModelAndView showRegisterForm() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("userDTO", new UserDTO());
        return modelAndView;
    }

    @PostMapping("/validateUser")
    public ModelAndView checkValidation(@Validated @ModelAttribute("userDTO") UserDTO userDTO, BindingResult bindingResult) {
        System.out.println(bindingResult.hasFieldErrors());
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("/index");
        }
        return new ModelAndView("/result");
    }
}