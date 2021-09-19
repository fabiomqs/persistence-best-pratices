package com.github.fabiomqs.repository;

import com.github.fabiomqs.entity.BookSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookSetRepository extends JpaRepository<BookSet, Long> {
}
