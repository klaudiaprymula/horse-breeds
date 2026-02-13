package com.example.horsebreeds.controller;

import com.example.horsebreeds.model.Breed;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BreedController {

    @Value("${API_TOKEN:}")
    private String apiToken;

    @GetMapping("/")
    public String home() {
        return "Horse Breeds API - running | API_TOKEN set: " + (!apiToken.isBlank());
    }

    @GetMapping("/breeds")
    public List<Breed> getBreeds() {
        return List.of(
                new Breed("arabian", "Arabian", "Middle East"),
                new Breed("friesian", "Friesian", "Netherlands"),
                new Breed("quarter-horse", "American Quarter Horse", "USA"),
                new Breed("thoroughbred", "Thoroughbred", "UK")
        );
    }
}
