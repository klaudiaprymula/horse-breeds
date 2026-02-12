package com.example.horsebreeds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreedController {

    @GetMapping("/")
    public String home() {
        return "Horse Breeds API - running";
    }
}