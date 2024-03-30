package com.TPK.OAuth2Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping(value = "/home")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/about")
    public String about() {
        return "about";
    }

}
