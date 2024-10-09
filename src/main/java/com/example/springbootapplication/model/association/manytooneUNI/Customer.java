package com.example.springbootapplication.model.association.manytooneUNI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstname;
    private String lastname;

}
