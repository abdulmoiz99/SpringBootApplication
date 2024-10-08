package com.example.springbootapplication.model.association.onetomanyUNI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    private int id;
    private String brand;
    private String model;
}
