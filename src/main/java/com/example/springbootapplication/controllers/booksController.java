package com.example.springbootapplication.controllers;


import com.example.springbootapplication.model.Book;
import com.example.springbootapplication.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class booksController {

    @Autowired
    private  bookRepository bookRepository;

    @PostMapping
    public ResponseEntity<String> addNewBooks(@RequestBody List<Book> newBooks) {
        bookRepository.saveAll(newBooks);
        return new ResponseEntity<>("Books added successfully!", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = bookRepository.findAll();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateBook(@PathVariable int id, @RequestBody Book updatedBook) {

        Book book = bookRepository.findById(id).get();
        book.setIsbn(updatedBook.getIsbn());
        book.setTitle(updatedBook.getTitle());
        book.setPrice(updatedBook.getPrice());
        bookRepository.save(book);

        return new ResponseEntity<>("Book updated successfully", HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
       bookRepository.deleteById(id);
       return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}