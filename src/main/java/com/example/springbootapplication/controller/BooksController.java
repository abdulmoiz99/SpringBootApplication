package com.example.springbootapplication.controller;

import com.example.springbootapplication.model.Books;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private List<Books> books = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> addNewBooks(@RequestBody List<Books> newBooks) {
        books.addAll(newBooks);
        return new ResponseEntity<>("Books added successfully!", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Books>> getBooks() {
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping(produces = "application/cs.miu.edu-v2+json")
    public ResponseEntity<List<Books>> getBooksV2() {
        List<Books> limitedBooks = books.size() > 2 ? books.subList(0, 2) : books;
        return new ResponseEntity<>(limitedBooks, HttpStatus.OK);
    }
    @GetMapping(value = "", headers = "X-API-VERSION=3")
    public ResponseEntity<List<Books>> getBooksV3() {
        List<Books> limitedBooks = books.size() > 3 ? books.subList(0, 3) : books;
        return new ResponseEntity<>(limitedBooks, HttpStatus.OK);
    }

    @GetMapping("/v4")
    public ResponseEntity<List<Books>> getBooksV4() {
        List<Books> limitedBooks = books.size() > 4 ? books.subList(0, 4) : books;
        return new ResponseEntity<>(limitedBooks, HttpStatus.OK);
    }
    @GetMapping("/v5")
    public ResponseEntity<List<Books>>getBooksV5(@RequestParam int version) {
        if(version == 5){
            List<Books> limitedBooks = books.size() > 5 ? books.subList(0, 5) : books;
            return new ResponseEntity<>(limitedBooks, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Books> getBooksById(@PathVariable int id) {
        Books bookToReturn = null;
        for(Books book : books) {
            if(book.getId() == id) {
                bookToReturn = book;
                break;
            }
        }
        if(bookToReturn == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bookToReturn, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateBook(@PathVariable int id, @RequestBody Books updatedBook) {
        for(Books book : books) {
            if(book.getId() == id) {
                book.setId(updatedBook.getId());
                book.setTitle(updatedBook.getTitle());
                book.setIsbn(updatedBook.getIsbn());
                book.setPrice(updatedBook.getPrice());
                break;
            }
        }
        return new ResponseEntity<>("Book updated successfully", HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        Books bookToRemove = null;
        for (Books book : books) {
            if (book.getId() == id) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
        }
    }
}
