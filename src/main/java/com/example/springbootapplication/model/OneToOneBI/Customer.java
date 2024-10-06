package com.example.springbootapplication.model.OneToOneBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToOne
    private Address address;
}
