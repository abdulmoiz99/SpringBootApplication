package com.example.springbootapplication.model.inheritence.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private int id;
    private String name;
    private int age;

    @Embedded
    private Address address;
}
