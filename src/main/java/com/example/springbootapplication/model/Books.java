package com.example.springbootapplication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Books {
    private int id;
    private String title;
    private String isbn;
    private double price;
}
