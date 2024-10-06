package com.example.springbootapplication.model.inheritence.joinedTable;

import jakarta.persistence.Entity;

@Entity
public class CheckingAccount extends Account {
    private int overDraftLimit;
}
