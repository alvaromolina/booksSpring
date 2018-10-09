package com.ucbcba.books.controllers;


import com.ucbcba.books.entities.Book;
import com.ucbcba.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {
    BookService bookService;


    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String index( Model model) {
        List<Book> books  = (List) bookService.listAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @RequestMapping(value = "/book/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable Integer id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "editBook";
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public String show(@PathVariable Integer id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "showBook";
    }
    @RequestMapping(value = "/book/new", method = RequestMethod.GET)
    public String newBook( Model model) {
        return "newBook";
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String create(@ModelAttribute("book") Book book, Model model) {
        bookService.saveBook(book);
        return "redirect:/books";
    }
}
