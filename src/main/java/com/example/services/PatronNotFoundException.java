package com.example.services;

public class PatronNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public PatronNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
