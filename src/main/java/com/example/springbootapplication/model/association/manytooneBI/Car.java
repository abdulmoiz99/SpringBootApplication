package com.example.springbootapplication.model.association.manytooneBI;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    private int id;
    private String brand;
    private String model;

    @ManyToOne
    @JoinTable(name = "person_car",
            joinColumns = @JoinColumn(name = "personId"),
            inverseJoinColumns = @JoinColumn(name = "carId"))
    private Person owner;
}
