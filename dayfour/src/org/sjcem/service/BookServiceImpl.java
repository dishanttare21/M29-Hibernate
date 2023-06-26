package org.sjcem.service;

import java.util.List;

import org.sjcem.dao.BookDao;
import org.sjcem.dao.BookDaoImpl;
import org.sjcem.entities.Book;

public class BookServiceImpl implements BookService {
	
	private BookDao dao;
	
	//default constructor
	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}

	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getBookByPrice(double low, double high) {
		return dao.getBookByPrice(low, high);
	}

}
