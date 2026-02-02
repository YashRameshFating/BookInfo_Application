package com.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.BookRepository;
import com.book.entities.Book;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    
    //for getting all the books
    public List<Book> getAllBook(){
    	return (List<Book>)bookRepository.findAll();
    }
    
    //for getting the single book
    public Book getBookById(int bId) {
        return bookRepository.findById(bId).orElse(null);
    }

    
    //for post request
    public Book addBook(Book book) {
    	  return bookRepository.save(book);
    }
    
    //for delete book
    public void deleteBook(int bId) {
    	bookRepository.deleteById(bId);
    }
    
    //for updating 
    public Book updateBook(Book book, int bookId) {
        Book existing = bookRepository.findById(bookId).orElse(null);

        if (existing == null) {
            return null;
        }

        existing.setName(book.getName());
        existing.setAuthor(book.getAuthor());

        return bookRepository.save(existing);
    }

}
