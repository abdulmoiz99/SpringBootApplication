package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.*;

import java.util.List;

public class Student {
    @Id
    private int id;
    private String name;
    private int age;

    @ManyToMany
    @JoinTable(name = "student_course",
                joinColumns = @JoinColumn(name = "course_id"),
                inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Course> courses;
}
