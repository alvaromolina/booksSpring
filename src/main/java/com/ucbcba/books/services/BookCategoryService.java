package com.ucbcba.books.services;

import com.ucbcba.books.entities.BookCategory;

public interface BookCategoryService {


    Iterable<BookCategory> listAllBookCategories();

}
