package com.dsi.springbootbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    @ResponseBody
    public String home() {
        return "Welcome to Spring Boot Basic";
    }

}
