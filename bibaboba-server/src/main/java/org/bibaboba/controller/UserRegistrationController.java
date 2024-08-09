package org.bibaboba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UserRegistrationController {

    @GetMapping
    public String getSite(){
        return "Hello";
    }



}
