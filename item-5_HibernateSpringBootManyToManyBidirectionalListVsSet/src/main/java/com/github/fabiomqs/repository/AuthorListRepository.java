package com.github.fabiomqs.repository;

import com.github.fabiomqs.entity.AuthorList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorListRepository extends JpaRepository<AuthorList, Long> {

}