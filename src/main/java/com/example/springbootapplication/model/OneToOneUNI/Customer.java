package com.example.springbootapplication.model.OneToOneUNI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToOne
    @PrimaryKeyJoinColumn // This will create a shared PK, we can remove this as well
    // if we remove this, we will have a PK in the customer table
    // else we both the table wil share the PK and we cannot use the @GenerateValue annotation
    private Address address;
}
