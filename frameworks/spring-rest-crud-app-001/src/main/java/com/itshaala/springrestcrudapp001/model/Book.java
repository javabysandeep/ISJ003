package com.itshaala.springrestcrudapp001.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private int bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_price")
    private int bookPrice;
}
