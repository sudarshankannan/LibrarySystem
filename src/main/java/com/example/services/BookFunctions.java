package com.example.services;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Book;
import com.example.repositories.BookRepo;

@Service
@ComponentScan({"com.example.repositories"})
public class BookFunctions implements BookRestService {

	private final BookRepo bookRepo;

	public BookFunctions(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Book> searchBooks(String title) {
		if (title != null) {
			return bookRepo.searchLibrary(title);
		}
		return bookRepo.findAll();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Book getByISBN(long isbn) {
		return bookRepo.findById(isbn)
				.orElseThrow(() -> new BookNotFoundException(String.format("No book with ISBN %d in the library", isbn)));
	}

	@Override
	public void addBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public void updateBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public void deleteBook(long isbn) {
		final Book book = bookRepo.findById(isbn)
				.orElseThrow(() -> new BookNotFoundException(String.format("No book with ISBN %d in the library", isbn)));

		bookRepo.deleteById(book.getISBN());
	}

}