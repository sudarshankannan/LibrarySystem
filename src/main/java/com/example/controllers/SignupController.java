package com.example.controllers;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Book;
import com.example.model.Patron;
import com.example.services.PatronRestService;

@Controller
@ComponentScan({"com.example.services"})
public class SignupController {
	private final PatronRestService pService;

	public SignupController(PatronRestService patronService) {
		this.pService = patronService;
	}

	@GetMapping("/patrons")
	public String findAllPatrons(Model model) {
		final List<Patron> patrons = pService.getAllPatrons();

		model.addAttribute("patrons", patrons);
		return "list-books";
	}

	@GetMapping("/searchPatrons")
	public String searchPatrons() {
//			final List<Book> books = bService.searchBooks(title);
//
//			model.addAttribute("books", books);
//			model.addAttribute("title", title);
		return "searchpatrons";
	}

	@GetMapping("/patron/{id}")
	public String findPatronById(@PathVariable("id") int id, Model model) {
		final Patron patron = pService.getById(id);

		model.addAttribute("patron", patron);
		return "list-book";
	}

	@GetMapping("/signup")
	public String addPatron(Patron patron, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "signup";
		}
		return "signup";
	}
	@RequestMapping("/signup")
	public String createBook(Patron patron, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "signup";
		}

		pService.addPatron(patron);
		return "redirect:/signup";
	}
	@GetMapping("/login")
	public String login(Patron patron, BindingResult result, Model model) {
//			if (result.hasErrors()) {
//				return "addbook";
//			}
//
//			bService.addBook(book);
//			model.addAttribute("book", bService.getAllBooks());
		return "login";
	}	
	@GetMapping("/update/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
		final Patron patron = pService.getById(id);

		model.addAttribute("Patron", patron);
		return "update-patron";
	}

	@GetMapping("/removePatron/{id}")
	public String deletePatron(@PathVariable("id") int id, Model model) {
		pService.deletePatron(id);

		model.addAttribute("patron", pService.getAllPatrons());
		return "redirect:/patrons";
	}

}
