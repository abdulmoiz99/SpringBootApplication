package com.example.springbootapplication.model.association.onetooneBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Customer customer;
}
