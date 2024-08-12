package org.bibaboba.controller;

import org.bibaboba.dto.UserRegisterDTO;
import org.bibaboba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public UserRegisterDTO userRegisterDTO(){
        return new UserRegisterDTO();
    }
    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegisterDTO userRegisterDTO){
        userService.save(userRegisterDTO);
        return "redirect:/registration?success";
    }



}
