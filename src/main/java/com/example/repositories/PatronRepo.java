package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Book;
import com.example.model.Patron;

public interface PatronRepo extends JpaRepository<Patron, Long> {
		@Query("SELECT a FROM Patrons p WHERE p.id LIKE %?1%")
		public List<Patron> searchPatrons(int id);
}
