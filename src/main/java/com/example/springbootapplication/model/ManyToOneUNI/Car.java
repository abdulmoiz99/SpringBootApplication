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
    @JoinTable(name = "cars_customer",
            joinColumns ={ @JoinColumn(name = "car_id")},
            inverseJoinColumns = {@JoinColumn(name = "customer_id")})
    private Customer customer;
}
