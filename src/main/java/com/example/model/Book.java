package com.example.model;

import javax.persistence.Entity;

@Entity
public class Book{
    String title;
    String author;
    int numBooks;
	Long isbn;
    //constructors
    Book(){
        String title = null;
        String author = null;
        int numBooks = 3;
        Long isbn = (long) -1;
    }
    //getters
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getNumBooks(){
        return this.numBooks;
    }
    public Long getIsbn() {
		// TODO Auto-generated method stub
		return this.isbn;
	}
    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setNumBooks(int numBooks){
        this.numBooks = numBooks;
    }
	public void setIsbn(Long isbn) {
		// TODO Auto-generated method stub
		this.isbn = isbn;
	}
}