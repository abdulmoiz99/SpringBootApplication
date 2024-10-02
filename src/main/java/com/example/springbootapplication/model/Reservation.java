package com.example.springbootapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Reservation {
    @Id
    private int id;
    private String reservationNo;
    private String reservationDate;
}