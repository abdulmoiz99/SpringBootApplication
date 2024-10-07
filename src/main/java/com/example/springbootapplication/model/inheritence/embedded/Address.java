package com.example.springbootapplication.model.inheritence.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
}
