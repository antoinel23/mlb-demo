package com.mlb.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class ExceptionHelper {
	@ExceptionHandler(value = { NumberFormatException.class })
	public String handleInvalidID() {
		System.out.println("Invalid ID: received type String but needed type int");
		return "error";
	}

	@ExceptionHandler(value = { HttpClientErrorException.class })
	public String handleObjectNotFound() {
		System.out.println("Object not found for the Specified ID");
		return "error";
	}
}