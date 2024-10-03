package com.example.springbootapplication.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`order`") // Using back-tick to escape the reserved keyword
public class Order  {
    @Id
    private int orderId;
    private String date;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();
}