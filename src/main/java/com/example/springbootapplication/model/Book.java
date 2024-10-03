package com.example.springbootapplication.model;

import jakarta.persistence.Entity;

@Entity
public class Book extends Product {
    private String title;
}
