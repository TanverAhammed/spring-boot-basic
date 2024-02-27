package com.dsi.springbootbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping
    @ResponseBody
    public String home() {
        return "Welcome to Spring Boot Basic";
    }

    @GetMapping("/users")
    @ResponseBody
    public List<String> getAllUsers() {
        return new ArrayList<>(List.of("Tanvert", "Ahammed", "Aminul", "Bari"));
    }

}
