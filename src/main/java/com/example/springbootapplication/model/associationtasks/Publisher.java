package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Publisher {
    @Id
    private int id;
    private String name;


}
