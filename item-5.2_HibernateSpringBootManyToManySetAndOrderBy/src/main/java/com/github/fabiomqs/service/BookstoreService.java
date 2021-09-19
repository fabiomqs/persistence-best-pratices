package com.github.fabiomqs.service;

import com.github.fabiomqs.entity.Author;
import com.github.fabiomqs.entity.Book;
import com.github.fabiomqs.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class BookstoreService {

    private final BookRepository bookRepository;

    public BookstoreService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    @Transactional
    public void fetchAuthorsOfBook() {
        Book book = bookRepository.findById(1L).orElseThrow();
        Set<Author> authorsSet = book.getAuthors();

        System.out.println("Authors ordered descending by name:\n" + authorsSet);
    }
}
