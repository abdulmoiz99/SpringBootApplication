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

    @GetMapping()
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getSpecificBook(@PathVariable int id){
        Book book = books.stream()
                .filter(b -> b.getId() == id)
                .findAny()
                .orElse(null);

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Void> updateBook(@PathVariable int id,  @RequestBody Book book) {
        Book bookToUpdate = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);

        if(bookToUpdate != null) {
            bookToUpdate.setId(book.getId());
            bookToUpdate.setTitle(book.getTitle());
            bookToUpdate.setIsbn(book.getIsbn());
            bookToUpdate.setPrice(book.getPrice());

            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        Book bookToDelete = books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);

        if(bookToDelete != null) {
            books.remove(bookToDelete);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
