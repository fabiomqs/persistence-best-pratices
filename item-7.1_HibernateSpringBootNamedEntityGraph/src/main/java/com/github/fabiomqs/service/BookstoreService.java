package com.github.fabiomqs.service;


import java.util.List;

import com.github.fabiomqs.entity.Author;
import com.github.fabiomqs.entity.Book;
import com.github.fabiomqs.repository.AuthorRepository;
import com.github.fabiomqs.repository.BookRepository;
import org.springframework.stereotype.Service;

import static com.github.fabiomqs.specs.AuthorSpecs.isAgeGt45;

@Service
public class BookstoreService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BookstoreService(AuthorRepository authorRepository,
                            BookRepository bookRepository) {

        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public void displayAuthorsAndBooks() {

        List<Author> authors = authorRepository.findAll();

        for (Author author : authors) {
            System.out.println("Author: " + author);
            System.out.println("No of books: "
                    + author.getBooks().size() + ", " + author.getBooks());
        }
    }

    public void displayAuthorsAndBooksByAge(int age) {

        List<Author> authors = authorRepository.findByAgeLessThanOrderByNameDesc(age);

        for (Author author : authors) {
            System.out.println("Author: " + author);
            System.out.println("No of books: "
                    + author.getBooks().size() + ", " + author.getBooks());
        }
    }

    public void displayAuthorsAndBooksByAgeWithSpec() {

        List<Author> authors = authorRepository.findAll(isAgeGt45());

        for (Author author : authors) {
            System.out.println("Author: " + author);
            System.out.println("No of books: "
                    + author.getBooks().size() + ", " + author.getBooks());
        }
    }

    public void displayAuthorsAndBooksFetchAllAgeBetween20And40() {

        List<Author> authors = authorRepository.fetchAllAgeBetween20And40();

        for (Author author : authors) {
            System.out.println("Author: " + author);
            System.out.println("No of books: "
                    + author.getBooks().size() + ", " + author.getBooks());
        }
    }

    public void displayBooksAndAuthors() {

        List<Book> books = bookRepository.findAll();

        for (Book book : books) {
            System.out.println("Book: " + book);
            System.out.println("Author: " + book.getAuthor());
        }
    }
}
