package com.ucbcba.books.repositories;


import com.ucbcba.books.entities.Book;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface BookRepository extends CrudRepository<Book, Integer>{

}
