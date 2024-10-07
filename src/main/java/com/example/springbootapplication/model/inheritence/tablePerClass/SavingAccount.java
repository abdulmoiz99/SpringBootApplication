package com.example.springbootapplication.model.inheritence.tablePerClass;

import jakarta.persistence.Entity;

@Entity
public class SavingAccount extends Account {
    private int APY;
}
