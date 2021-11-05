package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.services.BookRestService;

@Controller
@ComponentScan({"com.example.services"})
public class BookController {

	private final BookRestService bService;

	public BookController(BookRestService bookService) {
		this.bService = bookService;
	}

	@GetMapping("/books")
	public String findAllBooks(Model model) {
		final List<Book> books = bService.getAllBooks();

		model.addAttribute("books", books);
		return "list-books";
	}

	@GetMapping("/searchbook")
	public String searchBook(Book book, BindingResult result, Model model) {
//		final List<Book> books = bService.searchBooks(title);
//
//		model.addAttribute("books", books);
//		model.addAttribute("title", title);
		return "searchbook";
	}

	@GetMapping("/book/{isbn}")
	public String findBookById(@PathVariable("isbn") Long isbn, Model model) {
		final Book book = bService.getByISBN(isbn);

		model.addAttribute("book", book);
		return "list-book";
	}

	@GetMapping("/addbook")
	public String addBook(Book book, BindingResult result, Model model) {
//		if (result.hasErrors()) {
//			return "addbook";
//		}
//		bService.addBook(book);
//		model.addAttribute("book", bService.getAllBooks());
		return "addbook";
	}

	@GetMapping("/update/{isbn}")
	public String showUpdateForm(@PathVariable("isbn") Long isbn, Model model) {
		final Book book = bService.getByISBN(isbn);

		model.addAttribute("book", book);
		return "update-book";
	}

	@GetMapping("/update-book/{isbn}")
	public String updateBook(@PathVariable("isbn") Long isbn, Book book, BindingResult result, Model model) {
		if (result.hasErrors()) {
			book.setIsbn(isbn);
			return "update-book";
		}

		bService.updateBook(book);
		model.addAttribute("book", bService.getAllBooks());
		return "redirect:/books";
	}

	@GetMapping("/remove-book/{isbn}")
	public String deleteBook(@PathVariable("isbn") Long isbn, Model model) {
		bService.deleteBook(isbn);

		model.addAttribute("book", bService.getAllBooks());
		return "redirect:/books";
	}

}