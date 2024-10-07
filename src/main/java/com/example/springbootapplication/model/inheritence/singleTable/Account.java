package com.example.springbootapplication.model.inheritence.singleTable;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // by default its single table
@DiscriminatorColumn(name = "account_type",
                    discriminatorType = DiscriminatorType.STRING)
public abstract class Account {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int number;
    private float balance;
}
