package com.example.springbootapplication.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
//@Entity
@Table(name = "books")
public class Books {

    @Id
    private int id;
    private String title;
    private String isbn;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
}