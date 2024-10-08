package com.example.springbootapplication.controller;

import com.example.springbootapplication.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {

    private List<Book> books = new ArrayList<Book>();

    @PostMapping()
    public ResponseEntity<Void> addBook(@RequestBody Book book) {
        books.add(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

  
}
