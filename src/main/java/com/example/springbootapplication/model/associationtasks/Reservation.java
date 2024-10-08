package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reservation {

    @Id
    private int id;
    private String task;
    private String description;
    private String location;


}
