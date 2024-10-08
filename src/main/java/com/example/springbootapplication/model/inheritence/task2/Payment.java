package com.example.springbootapplication.model.inheritence.task2;

import jakarta.persistence.Embeddable;

@Embeddable
public class Payment {
    private String paydate;
    private double amount;

}
