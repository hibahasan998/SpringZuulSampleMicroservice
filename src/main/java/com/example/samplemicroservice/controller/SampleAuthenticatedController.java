package com.example.samplemicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample2")
public class SampleAuthenticatedController{

    @GetMapping("/auth-message")
    public String getAuthMessage() {
        return "Hello this is an authenticated sample microservice";
    }
}
