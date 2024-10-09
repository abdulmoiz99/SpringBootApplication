package com.example.springbootapplication.model.association.manytomanyBI;

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
            inverseJoinColumns = @JoinColumn(name = "salesPerson_id"))
    private List<SalesPerson> salesPeople;
}
