package com.example.springbootapplication.model.inheritence.tablePerClass;

import jakarta.persistence.Entity;

@Entity
public class CheckingAccount extends Account {
    private int overdraftLimit;
}
