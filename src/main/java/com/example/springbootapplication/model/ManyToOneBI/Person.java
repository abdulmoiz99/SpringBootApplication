package com.example.springbootapplication.model.ManyToOneBI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "owner")
    private List<Car> cars = new ArrayList<>();
}
