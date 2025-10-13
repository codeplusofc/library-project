package com.library.api.controller;

import com.library.api.model.BookEntity;
import com.library.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable Long id, @RequestBody BookEntity bookEntity) {
        Optional<BookEntity> livroDoBancoDeDados = bookRepository.findById(id);

        livroDoBancoDeDados.get().setAuthor(bookEntity.getAuthor());
        livroDoBancoDeDados.get().setGenre(bookEntity.getGenre());
        livroDoBancoDeDados.get().setPages(bookEntity.getPages());
        livroDoBancoDeDados.get().setTitle(bookEntity.getTitle());

         return bookRepository.save(livroDoBancoDeDados.get());


    }
    @GetMapping("/{id}")
    public Optional<BookEntity> findBookById(@PathVariable Long id) {
        Optional<BookEntity> book = bookRepository.findById(id);
        if (book.isEmpty()) {
            throw new RuntimeException("Book not found");
        }
        return book;
    }
}
