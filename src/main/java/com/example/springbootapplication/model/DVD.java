package com.example.springbootapplication.model;


import jakarta.persistence.Entity;

@Entity
public class DVD extends Product{
    private String genre;
}
