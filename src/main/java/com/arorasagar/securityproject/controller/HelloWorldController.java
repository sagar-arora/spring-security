package com.arorasagar.securityproject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    @GetMapping("/hello")
    @CrossOrigin
    public String helloWorld() {
        return "hello world!";
    }
}
