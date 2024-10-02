package com.example.springbootapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Publisher {
    @Id
    private long id;
    private String name;
}
