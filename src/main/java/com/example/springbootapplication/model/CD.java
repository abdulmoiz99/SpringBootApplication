package com.example.springbootapplication.model;

import jakarta.persistence.Entity;

@Entity
public class CD extends Product {
    private String artist;
}

