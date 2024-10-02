package com.example.springbootapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Courses {
    @Id
    private int id;
    private String title;
    private String description;

    @ManyToMany(mappedBy = "CourseAssigned")
    private List<Student> students = new ArrayList<>();
}

