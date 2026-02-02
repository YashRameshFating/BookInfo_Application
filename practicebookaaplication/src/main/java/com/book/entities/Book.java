package com.book.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookdata")
public class Book {
	
    @Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    
     private String name;
     private String author;
	 public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	 }
	 public Book() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getAuthor() {
		 return author;
	 }
	 public void setAuthor(String author) {
		 this.author = author;
	 }
	 @Override
	 public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	 }
     
}
