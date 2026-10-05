package com.example.order_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/controller")
public class OrderController {

    @GetMapping
    public  String test(){
        return "Noor";
    }
}
