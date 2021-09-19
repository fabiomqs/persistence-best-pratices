package com.github.fabiomqs.service;

import com.github.fabiomqs.entity.AuthorList;
import com.github.fabiomqs.entity.AuthorSet;
import com.github.fabiomqs.entity.BookList;
import com.github.fabiomqs.entity.BookSet;
import com.github.fabiomqs.repository.AuthorListRepository;
import com.github.fabiomqs.repository.AuthorSetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookstoreService {

    private final AuthorSetRepository authorSetRepository;
    private final AuthorListRepository authorListRepository;

    public BookstoreService(AuthorSetRepository authorSetRepository,
                            AuthorListRepository authorListRepository) {

        this.authorSetRepository = authorSetRepository;
        this.authorListRepository = authorListRepository;
    }

    @Transactional
    public void persistAuthorWithBooksAndRemoveOneBookList() {

        AuthorList alicia = new AuthorList();
        alicia.setName("Alicia Tom");
        alicia.setAge(38);
        alicia.setGenre("Anthology");

        AuthorList mark = new AuthorList();
        mark.setName("Mark Janel");
        mark.setAge(23);
        mark.setGenre("Anthology");

        BookList bookOfSwords = new BookList();
        bookOfSwords.setIsbn("001-AT-MJ");
        bookOfSwords.setTitle("The book of swords");

        BookList oneDay = new BookList();
        oneDay.setIsbn("002-AT-MJ");
        oneDay.setTitle("One Day");

        BookList headDown = new BookList();
        headDown.setIsbn("001-AT");
        headDown.setTitle("Head Down");

        alicia.addBook(bookOfSwords);
        mark.addBook(bookOfSwords);
        alicia.addBook(oneDay);
        mark.addBook(oneDay);
        alicia.addBook(headDown);

        authorListRepository.save(alicia);
        authorListRepository.saveAndFlush(mark);

        System.out.println("================================================");
        System.out.println("Removing a book (List case) ...");
        System.out.println("================================================");

        alicia.removeBook(oneDay);
    }

    @Transactional
    public void persistAuthorWithBooksAndRemoveOneBookSet() {

        AuthorSet alicia = new AuthorSet();
        alicia.setName("Alicia Tom");
        alicia.setAge(38);
        alicia.setGenre("Anthology");

        AuthorSet mark = new AuthorSet();
        mark.setName("Mark Janel");
        mark.setAge(23);
        mark.setGenre("Anthology");

        BookSet bookOfSwords = new BookSet();
        bookOfSwords.setIsbn("001-AT-MJ");
        bookOfSwords.setTitle("The book of swords");

        BookSet oneDay = new BookSet();
        oneDay.setIsbn("002-AT-MJ");
        oneDay.setTitle("One Day");

        BookSet headDown = new BookSet();
        headDown.setIsbn("001-AT");
        headDown.setTitle("Head Down");

        alicia.addBook(bookOfSwords);
        mark.addBook(bookOfSwords);
        alicia.addBook(oneDay);
        mark.addBook(oneDay);
        alicia.addBook(headDown);

        authorSetRepository.save(alicia);
        authorSetRepository.saveAndFlush(mark);

        System.out.println("================================================");
        System.out.println("Removing a book (Set case) ...");
        System.out.println("================================================");

        alicia.removeBook(oneDay);
    }
}