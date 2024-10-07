package com.example.springbootapplication.model.ManyToManyUNI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SalesPerson {
    @Id
    private int id;
    private String alias;
    private String phoneNumber;
}
