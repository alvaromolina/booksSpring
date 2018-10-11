package com.ucbcba.books.services;

import com.ucbcba.books.entities.BookCategory;
import com.ucbcba.books.repositories.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookCategoryServiceImpl implements BookCategoryService{

    private BookCategoryRepository bookCategoryRepository;
    @Autowired
    @Qualifier(value = "bookCategoryRepository")
    public void setBookRepository(BookCategoryRepository bookCategoryRepository) {
        this.bookCategoryRepository = bookCategoryRepository;
    }

    @Override
    public Iterable<BookCategory> listAllBookCategories() {
        return bookCategoryRepository.findAll();
    }

}
