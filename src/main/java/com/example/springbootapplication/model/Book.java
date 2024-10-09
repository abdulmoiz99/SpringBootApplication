package com.example.springbootapplication.model;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String title;
    private String isbn;
    private double price;
}
