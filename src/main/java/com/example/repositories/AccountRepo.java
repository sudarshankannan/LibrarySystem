package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Book;

public interface AccountRepo <Patron, Long> extends JpaRepository<Book, Long> {
		@Query("SELECT a FROM Patrons p WHERE p.id LIKE %?1%")
		public List<Book> searchAccounts(String id);
}
