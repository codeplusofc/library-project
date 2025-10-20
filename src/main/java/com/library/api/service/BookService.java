package com.library.api.service;


import com.library.api.model.BookEntity;
import com.library.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookEntity updateBook(BookEntity bookEntity, Long id) {
        Optional<BookEntity> livroDoBanco = bookRepository.findById(id);

        if (livroDoBanco.isEmpty()) {
            throw new RuntimeException("Livro não encontrado.");
        }

        livroDoBanco.get().setId(bookEntity.getId());
        livroDoBanco.get().setTitle(bookEntity.getTitle());
        livroDoBanco.get().setAuthor(bookEntity.getAuthor());
        livroDoBanco.get().setGenre(bookEntity.getGenre());
        livroDoBanco.get().setPages(bookEntity.getPages());
        livroDoBanco.get().setReleaseDate(bookEntity.getReleaseDate());

        return bookRepository.save(livroDoBanco.get());
    }

    public Optional<BookEntity> findBookById(@PathVariable Long id) {
        return bookRepository.findById(id);
    }

}
