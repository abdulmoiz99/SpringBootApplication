package com.example.springbootapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Students {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToOne(mappedBy = "students")
    private Major major;
}