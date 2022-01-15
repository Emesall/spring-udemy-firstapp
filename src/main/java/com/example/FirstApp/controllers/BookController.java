package com.example.FirstApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FirstApp.repositories.BookRepository;

@Controller
public class BookController {

	private final BookRepository bookrepository;
	

	public BookController(BookRepository bookrepository) {
		this.bookrepository = bookrepository;
	}


	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookrepository.findAll());
		
		return "books/list";
	}
	
	
}
