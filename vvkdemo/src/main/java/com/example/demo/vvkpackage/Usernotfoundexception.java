package com.example.demo.vvkpackage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Usernotfoundexception extends RuntimeException {

	public Usernotfoundexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
