package com.example.springbootapplication.model.inheritence.joinedTable;

import jakarta.persistence.Entity;

@Entity
public class SavingAccount extends Account {
    private int APY;
}
