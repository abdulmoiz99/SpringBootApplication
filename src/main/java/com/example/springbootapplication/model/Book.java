package com.example.springbootapplication.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    private long id;
    private String title;
    private String author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
