package com.tholapz.springcourse.repositories;

import com.tholapz.springcourse.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
