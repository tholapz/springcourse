package com.tholapz.springcourse.repositories;

import com.tholapz.springcourse.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
