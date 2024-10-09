package com.example.springbootapplication.model.inheritence.task1;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CD")
public class CD extends Product{
    private String artist;
}
