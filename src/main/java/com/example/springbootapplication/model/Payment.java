package com.example.springbootapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
    @Id
    private String paydate;
    private double amount;
}
