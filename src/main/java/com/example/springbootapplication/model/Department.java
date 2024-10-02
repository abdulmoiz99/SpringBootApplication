package com.example.springbootapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Department {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
