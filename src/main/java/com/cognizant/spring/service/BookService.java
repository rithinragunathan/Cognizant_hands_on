package com.cognizant.spring.service;

import com.cognizant.spring.repository.BookRepository;

public class BookService {
    public BookService() {
        System.out.println("Book service invokes");
    }

    private BookRepository bookRepo;

    public void setBookRepo(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }
}


