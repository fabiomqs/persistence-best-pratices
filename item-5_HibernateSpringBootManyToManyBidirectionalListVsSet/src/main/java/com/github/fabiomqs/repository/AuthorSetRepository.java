package com.github.fabiomqs.repository;

import com.github.fabiomqs.entity.AuthorSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorSetRepository extends JpaRepository<AuthorSet, Long> {
}
