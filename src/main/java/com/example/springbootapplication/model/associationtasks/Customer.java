package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private String address;
    private String phone;

    @OneToMany
    private List<Reservation> reservations;
}
