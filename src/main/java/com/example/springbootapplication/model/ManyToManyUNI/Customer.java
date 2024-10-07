package com.example.springbootapplication.model.ManyToManyUNI;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "customers_salesPersons",
                joinColumns = {@JoinColumn(name = "customerKey")},
                inverseJoinColumns = {@JoinColumn(name = "salesPersonKey")})
    private List<SalesPerson> salesPerson = new ArrayList<>();
}
