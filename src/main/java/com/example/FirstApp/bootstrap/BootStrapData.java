package com.example.FirstApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.FirstApp.model.Author;
import com.example.FirstApp.model.Book;
import com.example.FirstApp.model.Publisher;
import com.example.FirstApp.repositories.AuthorRepository;
import com.example.FirstApp.repositories.BookRepository;
import com.example.FirstApp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository=publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Author author=new Author("First","Jak");
		Book book=new Book("Name","123");
		Publisher publisher=new Publisher();
		publisher.setName("pub");
		book.setPublisher(publisher);
		author.getBooks().add(book);
		book.getAuthors().add(author);
		publisher.getBooks().add(book);
		
		
		publisherRepository.save(publisher);
		authorRepository.save(author);
		bookRepository.save(book);
		
		
		System.out.println(bookRepository.count());
		
	}

}
