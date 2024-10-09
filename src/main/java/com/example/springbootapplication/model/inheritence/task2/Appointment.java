package com.example.springbootapplication.model.inheritence.task2;

import jakarta.persistence.*;

@Entity
public class Appointment {
    @Id
    private Long id;
    private String appdate;

    @OneToOne
    @JoinColumn(name = "patient")
    private Patient patient;

    @Embedded
    private Payment payment;

    @OneToOne
    @JoinColumn(name = "doctor") // Corrected position of @JoinColumn
    private Doctor doctor;
}
