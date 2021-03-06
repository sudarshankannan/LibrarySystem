package com.example.services;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.model.Book;
import com.example.model.Patron;

@ComponentScan({"com.example.services"})
@Service
public interface PatronRestService {

	public List<Patron> getAllPatrons();
	
	public List<Patron> searchPatrons(int id);

	public void addPatron(Patron patron);

	public void updatePatron(Patron patron);

	public void deletePatron(int id);

	Patron getById(int id);

}