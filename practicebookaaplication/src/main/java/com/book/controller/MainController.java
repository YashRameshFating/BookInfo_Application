package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entities.Book;
import com.book.services.BookService;

@RestController
public class MainController {
      
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return this.bookService.getAllBook();
	}
	
	@GetMapping("/books/{bookId}")
	public Book getBookById(@PathVariable("bookId") int bookId) {
		 
	return 	this.bookService.getBookById(bookId);
	
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book ) {
		return this.bookService.addBook(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookService.deleteBook(bookId);
	}
	
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book  book,@PathVariable("bookId") int bookId) {
		return this.bookService.updateBook(book, bookId);
	}
	
}
