package com.example.springbootapplication.model.OneToOneBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;

    @OneToOne(mappedBy = "address")
    private Customer customer;
}
