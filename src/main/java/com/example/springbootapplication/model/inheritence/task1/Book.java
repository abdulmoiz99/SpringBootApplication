package com.example.springbootapplication.model.inheritence.task1;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Book")
public class Book extends Product{
    private String title;
}
