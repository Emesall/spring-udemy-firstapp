package com.example.FirstApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
