package com.example.springbootapplication.model.association.manytooneUNI;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    private int id;
    private int year;
    private String make;

    @Transient
    private String model;

    @ManyToOne
    @JoinTable(name = "car_customers",
               inverseJoinColumns = @JoinColumn(name = "cust_id"),
               joinColumns = @JoinColumn(name = "ca_id"))
    private Customer customer;

}
