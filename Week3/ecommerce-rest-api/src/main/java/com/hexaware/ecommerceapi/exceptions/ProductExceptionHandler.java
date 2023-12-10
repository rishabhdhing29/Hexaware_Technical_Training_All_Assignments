package com.hexaware.ecommerceapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<String> handleAnyExp(Exception e) {

		return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
	}
}
