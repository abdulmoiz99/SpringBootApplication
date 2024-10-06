package com.example.springbootapplication.model.ManyToOneUNI;

import jakarta.persistence.*;

//@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String make;
    private String model;
    private int year;
    private String ownerName;

    @ManyToOne
    private Customer customer;
}
