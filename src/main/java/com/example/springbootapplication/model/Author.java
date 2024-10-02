package com.example.springbootapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Author {

    @Id
    private int id;
    private String firstName;
    private String lastName;
}