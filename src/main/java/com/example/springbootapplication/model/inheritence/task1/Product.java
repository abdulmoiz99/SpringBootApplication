package com.example.springbootapplication.model.inheritence.task1;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@DiscriminatorColumn(name = "product_type" , discriminatorType = DiscriminatorType.STRING)
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
}
