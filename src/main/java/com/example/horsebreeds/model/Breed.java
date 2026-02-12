package com.example.horsebreeds.model;

public class Breed {
    private String id;
    private String name;
    private String origin;

    public Breed(String id, String name, String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }
}