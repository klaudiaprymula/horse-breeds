package com.example.horsebreeds.controller;

import com.example.horsebreeds.model.Breed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BreedController {

    @GetMapping("/")
    public String home() {
        return "Horse Breeds API - running";
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