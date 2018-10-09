package com.ucbcba.books.services;

import com.ucbcba.books.entities.Book;

public interface BookService {

    Iterable<Book> listAllBooks();
    Book findBook(Integer id);
    void saveBook(Book book);
    void deleteBook(Integer id);

}
