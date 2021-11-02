package com.example.services;

import java.util.List;

import com.example.model.Book;

public interface BookRestService {

	public List<Book> getAllBooks();
	
	public List<Book> searchBooks(String keyword);

	public void addBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(long isbn);

	Book getByISBN(long id);

}
