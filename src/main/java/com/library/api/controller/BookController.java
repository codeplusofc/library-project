package com.library.api.controller;

import com.library.api.model.BookEntity;
import com.library.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    public BookRepository bookRepository;

    @PostMapping
    public BookEntity createBook(@RequestBody BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    @GetMapping
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }
}
