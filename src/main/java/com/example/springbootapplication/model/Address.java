package com.example.springbootapplication.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "PATIENT_ID") // Foreign key to Patient
    private Patient patient;

    private String street;

    private String city;

    private String zip;

}
