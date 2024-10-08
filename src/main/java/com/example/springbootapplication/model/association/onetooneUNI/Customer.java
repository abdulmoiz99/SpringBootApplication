package com.example.springbootapplication.model.association.onetooneUNI;

import jakarta.persistence.*;

@Entity
@Table(name = "cust")
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;
}
