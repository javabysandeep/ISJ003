package com.itshaala.springrestcrudapp001.service;

import com.itshaala.springrestcrudapp001.dao.BookDao;
import com.itshaala.springrestcrudapp001.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public Book addBook(Book book) {
        return bookDao.save(book);
    }

    public Book updateBook(Book book) {
        return bookDao.save(book);
    }

    public void deleteBook(Book book) {
        bookDao.delete(book);
    }

    public Book getBookById(int bookId) {
        return bookDao.findById(bookId).get();
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookDao.findAll();
    }

    public List<Book> getBookByName(String name) {
        return bookDao.findBookByBookNameContaining(name);
    }
}
