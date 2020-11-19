package com.vsvdev.mongocrud.controller;

import com.vsvdev.mongocrud.model.Book;
import com.vsvdev.mongocrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
private final BookRepository repository;

@Autowired
    public BookController(BookRepository repository) {
        this.repository = repository;
    }
    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
    repository.save( book );
    return "Added book with id: "+book.getId();
    }

    @GetMapping("/findAll")
    public List<Book> getBooks(){
    return repository.findAll();
    }

    @GetMapping("/findBook/{id}")
    public Optional<Book> getBook(@PathVariable int id){
    return repository.findById( id );
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
    repository.deleteById( id );
    return "book deleteted with id:  "+id;
    }

}
