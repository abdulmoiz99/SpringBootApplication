package com.example.springbootapplication.repository;

import com.example.springbootapplication.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface bookRepository extends CrudRepository<Book,Integer > {
    List<Book> findAll();
}
