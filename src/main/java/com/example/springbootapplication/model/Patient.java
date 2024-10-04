package com.example.springbootapplication.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Patient {
    @Id
    private Long id;
    private String name;

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private Address address;
}
