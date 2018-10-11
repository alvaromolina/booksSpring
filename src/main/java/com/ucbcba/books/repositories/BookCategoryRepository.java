package com.ucbcba.books.repositories;


import com.ucbcba.books.entities.BookCategory;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface BookCategoryRepository extends CrudRepository<BookCategory, Integer> {
}
