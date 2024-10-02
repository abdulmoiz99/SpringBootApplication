package com.example.springbootapplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String address;

    @ManyToOne
    private Department department;
}