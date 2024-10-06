package com.example.springbootapplication.model.ManyToManyBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @ManyToMany
    private List<SalesPerson> salePersons = new ArrayList<>();
}
