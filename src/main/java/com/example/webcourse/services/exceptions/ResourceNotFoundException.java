package com.example.webcourse.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1l;
	
	public ResourceNotFoundException(Object id) {
		super("Resour not found. Id: " + id);
	}
}
