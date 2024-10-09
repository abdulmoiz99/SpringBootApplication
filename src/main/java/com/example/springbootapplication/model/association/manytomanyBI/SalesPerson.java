package com.example.springbootapplication.model.association.manytomanyBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class SalesPerson {
    @Id
    private int id;
    private String alias;
    private String phoneNumber;

    @ManyToMany(mappedBy = "salesPeople")
    private List<Customer> customers;
}
