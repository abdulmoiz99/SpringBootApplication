package com.example.springbootapplication.model.inheritence.singleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("savings")
public class SavingAccount extends Account {
    private int APY;
}
