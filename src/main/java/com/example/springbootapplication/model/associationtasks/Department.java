package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

//@Entity
public class Department {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
