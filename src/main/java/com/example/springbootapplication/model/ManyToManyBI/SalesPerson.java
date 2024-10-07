package com.example.springbootapplication.model.ManyToManyBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SalesPerson {

    @Id
    private int id;
    private String name;
    private String phoneNumber;

    @ManyToMany
    private List<Customer> customers = new ArrayList<>();
}
