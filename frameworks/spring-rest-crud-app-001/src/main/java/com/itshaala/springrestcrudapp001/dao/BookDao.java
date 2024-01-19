package com.itshaala.springrestcrudapp001.dao;

import com.itshaala.springrestcrudapp001.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends CrudRepository<Book, Integer> {

    //select * from book where book_name like '%booKName%'
    @Query
    List<Book> findBookByBookName(String bookName);

    @Query
    List<Book> findBookByBookNameContaining(String bookName);

}
