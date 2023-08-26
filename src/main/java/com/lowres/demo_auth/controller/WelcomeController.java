package com.lowres.demo_auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {
    
    @PostMapping("/welcome")
    public String welcome() {
        return "Welcome from secure endpoint";
    }
}
