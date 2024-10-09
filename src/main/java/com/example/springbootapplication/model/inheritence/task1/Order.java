package com.example.springbootapplication.model.inheritence.task1;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "`order`")
public class Order {
    @Id
    private int id;
    private int orderid;
    private String date;

    @OneToMany
    private List<OrderLine> orderlines;


    @ManyToOne
    private Customer customer;
}
