package com.example.services;

public class BookNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public BookNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
