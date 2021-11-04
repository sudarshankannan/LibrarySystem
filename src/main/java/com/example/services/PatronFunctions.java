package com.example.services;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Book;
import com.example.model.Patron;
import com.example.repositories.BookRepo;
import com.example.repositories.PatronRepo;

@Service
@ComponentScan({"com.example.repositories"})
public class PatronFunctions implements PatronRestService{

	private final PatronRepo patronRepo;
	public PatronFunctions() {
		this.patronRepo = null;
	}
	public PatronFunctions(PatronRepo  patronRepo) {
		this.patronRepo = patronRepo;
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Patron> getAllPatrons() {
		return patronRepo.findAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Patron> searchPatrons(int id) {
		if (id >= 0) {
			return patronRepo.searchPatrons(id);
		}
		return patronRepo.findAll();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Patron getById(int id) {
		return patronRepo.findById((long) id)
				.orElseThrow(() -> new PatronNotFoundException(String.format("No book with ISBN %d in the library", id)));
	}

	@Override
	public void addPatron(Patron patron) {
		//bookRepo.save(book);
	}

	@Override
	public void updatePatron(Patron patron) {
		patronRepo.save(patron);
	}

	@Override
	public void deletePatron(int id) {
		final Patron patron = patronRepo.findById((long) (id))
				.orElseThrow(() -> new PatronNotFoundException(String.format("No book with id %d in the library", id)));

		patronRepo.deleteById((long) (patron.getId()));
	}

}
