package com.example.springbootapplication.model.inheritence.task1;

import jakarta.persistence.*;

@Entity
public class OrderLine {
    @Id
    private int id;
    private int quantity;

    @ManyToOne
    @JoinTable(name = "orderLine_product",
            joinColumns = @JoinColumn(name = "orderlineid"),
            inverseJoinColumns = @JoinColumn(name = "productId"))
    private Product product;

}
