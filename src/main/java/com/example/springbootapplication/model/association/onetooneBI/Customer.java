package com.example.springbootapplication.model.association.onetooneBI;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;
}
