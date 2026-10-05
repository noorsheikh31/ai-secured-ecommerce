package com.example.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/controller")
public class AuthController {
    @GetMapping
    public String test(){
        return "Hello Noor";
    }
}
