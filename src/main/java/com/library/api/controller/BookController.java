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
        return bookRepository.save(bookEntity);
    }

    @GetMapping
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable Long id, @RequestBody BookEntity bookEntity) {

        //TODO: CRIAR UMA CLASSE DE BOOK SERVICE E COLOCAR ESSA LÓGICA DENTRO DELA
        //NÃO ESQUECER DE CHAMAR A CLASSE AQUI NA CONTROLLER PRA VOCÊ CONSEGUIR UTILIZAR ELA

        return bookService.updateBook(bookEntity, id);
    }

    @GetMapping("/{id}")
    public Optional<BookEntity> findBookById(@PathVariable Long id) {
        //TODO: EXTRA -> APÓS FINALIZAR A MIGRAÇÃO DA REGRA DE NEGÓCIO DO PUT, FAZER PARA O FIND BOOK BY ID TBM

        return bookRepository.findById(id);
    }
}
