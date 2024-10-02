package com.example.springbootapplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Major {
    @Id
    private int id;
    private String name;

    @OneToOne
    private Students students;
}
