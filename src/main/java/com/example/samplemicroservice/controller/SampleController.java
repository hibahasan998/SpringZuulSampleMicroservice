package com.example.samplemicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample1")
public class SampleController{

    @GetMapping("/message")
    public String getMessage() {
        return "Hello this is a sample microservice";
    }
}
