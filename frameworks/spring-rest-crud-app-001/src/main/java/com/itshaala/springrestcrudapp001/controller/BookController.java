package com.itshaala.springrestcrudapp001.controller;

import com.itshaala.springrestcrudapp001.model.Book;
import com.itshaala.springrestcrudapp001.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

//    @RequestMapping(method = RequestMethod.DELETE)
    @DeleteMapping
    public void deleteBook(@RequestBody Book book) {
        bookService.deleteBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }
    @GetMapping("/name/{name}")
    public List<Book> getBookByName(@PathVariable String name) {
        return bookService.getBookByName(name);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
