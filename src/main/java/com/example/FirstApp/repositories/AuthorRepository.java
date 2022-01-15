package com.example.FirstApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstApp.model.Author;
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
