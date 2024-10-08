package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
    @Id
    private int id;
    private String firstName;
    private String lastName;

}
