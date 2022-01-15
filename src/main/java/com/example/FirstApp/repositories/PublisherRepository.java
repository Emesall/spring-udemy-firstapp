package com.example.FirstApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.FirstApp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
