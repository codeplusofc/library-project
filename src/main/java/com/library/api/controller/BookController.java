package com.library.api.controller;

import com.library.api.model.BookEntity;
import com.library.api.repository.BookRepository;
import com.library.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    public BookRepository bookRepository;
    @Autowired
    public BookService bookService;

    @PostMapping
    public BookEntity createBook(@RequestBody BookEntity bookEntity) {
        //TODO: MOVER ESSA LÓGICA PARA O SERVIÇO
        return bookRepository.save(bookEntity);
    }

    @GetMapping
    public List<BookEntity> getAllBooks() {
        //TODO: MOVER ESSA LÓGICA PARA O SERVIÇO
        return bookRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        //TODO: MOVER ESSA LÓGICA PARA O SERVIÇO
        bookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable Long id, @RequestBody BookEntity bookEntity) {
        return bookService.updateBook(bookEntity, id);
    }

    @GetMapping("/{id}")
    public Optional<BookEntity> findBookById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }
}

//TODO: EXTRA: CRIAR CAMADA DE DTO PARA FUNCIONALIDADE DE LIVRO
