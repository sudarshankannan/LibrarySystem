package com.example.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.model.Book;

@RepositoryRestResource
public interface BookRepo extends JpaRepository<Book, Long> {
	@Query("SELECT b FROM Books b WHERE b.title LIKE %?1%")
	public List<Book> searchLibrary(String title);
}
