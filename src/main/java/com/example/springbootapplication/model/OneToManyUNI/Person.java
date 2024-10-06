package com.example.springbootapplication.model.OneToManyUNI;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    private int id;
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinTable(name = "person_cars",
        joinColumns = {@JoinColumn(name = "person_id")},
        inverseJoinColumns = {@JoinColumn(name = "car_id")})
    private List<Car> cars = new ArrayList<>();


}
