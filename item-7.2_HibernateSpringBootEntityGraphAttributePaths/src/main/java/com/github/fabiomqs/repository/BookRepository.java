package com.github.fabiomqs.repository;

import java.util.List;

import com.github.fabiomqs.entity.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Transactional(readOnly = true)
    @EntityGraph(attributePaths = {"author"}, type = EntityGraph.EntityGraphType.FETCH)
    @Override
    public List<Book> findAll();
}