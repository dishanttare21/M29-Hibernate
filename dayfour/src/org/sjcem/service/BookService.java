package org.sjcem.service;

import java.util.List;

import org.sjcem.entities.Book;

public interface BookService {
	
	//abstract by default
	Book getBookById(int id);  //single entity
	List<Book> getAllBooks();  //all the books
	Long getBookCount();  //count
	List<Book> getAuthorBooks(String author);  //for particular author
	List<Book> getBookByTitle(String title);   //for particular title
	List<Book> getBookByPrice(double low, double high); //price range
}
