package com.example.springbootapplication.model.association.onetomanyUNI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Person {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinColumn(name="person_id")
    private List<Car> cars;
}
