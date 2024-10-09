package com.example.springbootapplication.model.association.manytooneBI;

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

    @OneToMany(mappedBy = "owner")
    private List<Car> cars;
}
