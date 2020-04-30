package com.kai.hh.springhua.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/index")
    public String index() {
        return "Hello World";
    }

}