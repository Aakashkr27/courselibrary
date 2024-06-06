package com.application.courselibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class indexController {

    @GetMapping("/")
    public String listHome(){
        return "index";
    }
}
