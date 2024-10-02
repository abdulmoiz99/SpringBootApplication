package com.example.springbootapplication.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Reservation> reservations = new ArrayList<>();
}
