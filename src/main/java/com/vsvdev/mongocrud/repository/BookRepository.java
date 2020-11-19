package com.vsvdev.mongocrud.repository;

import com.vsvdev.mongocrud.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
