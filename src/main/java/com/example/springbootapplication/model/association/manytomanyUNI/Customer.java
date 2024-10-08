package com.example.springbootapplication.model.association.manytomanyUNI;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "customer_salespersons",
               joinColumns = @JoinColumn(name = "customer_id"),
               inverseJoinColumns = @JoinColumn(name = "salesperson_id"))
    private List<SalesPerson> salesPersons;
}
