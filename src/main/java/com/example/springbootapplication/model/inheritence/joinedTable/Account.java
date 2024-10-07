package com.example.springbootapplication.model.inheritence.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int accountNumber;
}
