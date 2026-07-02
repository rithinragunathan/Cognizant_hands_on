package com.cognizant.librarymanagement.controller;

import com.cognizant.librarymanagement.entity.Book;
import com.cognizant.librarymanagement.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @PostMapping("/add")
    public void addBook(@RequestBody Book book) {
        bookRepository.save(book);
    }


    @GetMapping("/getbooks")
    public List<Book> displayAllBook() {
       return bookRepository.findAll();
    }

    @GetMapping("/getbook/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return bookRepository.getBookById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBookById(@PathVariable Integer id){
        bookRepository.deleteById(id);
        return "Deleted the Book";
    }
    @PatchMapping("edit/{id}")
    public void editBookName(@PathVariable Integer id,
                             @RequestBody String name) {
        Book book = bookRepository.findById(id)
                .orElseThrow();
        book.setName(name);
        bookRepository.save(book);
    }
    @PutMapping("/edit/{id}")
    public void editBookName(@PathVariable Integer id,
                             @RequestBody Book book){
        book.setId(id);
        bookRepository.save(book);
    }
}
