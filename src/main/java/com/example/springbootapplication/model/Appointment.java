package com.example.springbootapplication.model;

import jakarta.persistence.*;

@Entity
public class Appointment {
    @Id
    private Long id;
    private String appdate;

    @ManyToOne
    private Patient patient;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PAYDATE")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "DOCTOR") // Many-to-one relationship with Doctor
    private Doctor doctor;
}
