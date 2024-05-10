package com.lowres.demo_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class WelcomeController {
    
    @GetMapping("/public")
    public String hello() {
        return "Welcome from public endpoint";
    }

    @GetMapping("/private")
    public String welcome() {
        return "Welcome from secure endpoint";
    }
}
