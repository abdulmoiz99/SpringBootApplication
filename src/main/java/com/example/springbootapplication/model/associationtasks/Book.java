package com.example.springbootapplication.model.associationtasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private String isbn;

    @ManyToOne
    @JoinTable(name = "book_publisher")
    private Publisher publisher;
}
