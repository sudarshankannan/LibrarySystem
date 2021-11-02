package com.example.model;

public class Book{
    String title;
    String author;
    int numBooks;
	long isbn;
    //constructors
    Book(){
        String title = null;
        String author = null;
        int numBooks = 3;
        long isbn = -1;
    }
    //getters
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    int getNumBooks(){
        return this.numBooks;
    }
    public long getISBN() {
		// TODO Auto-generated method stub
		return this.isbn;
	}
    //setters
    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setNumBooks(int numBooks){
        this.numBooks = numBooks;
    }
	public void setISBN(Long id) {
		// TODO Auto-generated method stub
		this.isbn = isbn;
	}
}