package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class Course {
    @Id
    private int id;
    private String name;
    private String description;
    private String location;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
