package com.tamjayz.data_jpa.repository;

import com.tamjayz.data_jpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
