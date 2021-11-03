package com.example.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Book;


public interface BookRepo extends JpaRepository<Book, Long> {
	@Query("SELECT b FROM Books b WHERE b.name LIKE %?1%" + " OR b.isbn LIKE %?1%")
	public List<Book> searchLibrary(String title);
}
