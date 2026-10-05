package com.example.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/controller")
public class ProductController {
    @GetMapping
    public String test(){
        return "Hello Tasmiya";
    }

}
