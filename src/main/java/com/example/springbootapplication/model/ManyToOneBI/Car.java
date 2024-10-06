package com.example.springbootapplication.model.ManyToOneBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {
    @Id
    private int id;
    private short year;
    private String model;
    private String maker;

    @ManyToOne
    private Person owner;
}
