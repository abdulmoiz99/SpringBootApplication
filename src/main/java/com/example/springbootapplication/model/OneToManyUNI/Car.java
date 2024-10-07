package com.example.springbootapplication.model.OneToManyUNI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    private int id;
    private int year;
    private String model;
    private String maker;
}
