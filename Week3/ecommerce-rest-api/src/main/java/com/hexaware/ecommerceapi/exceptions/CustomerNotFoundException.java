package com.hexaware.ecommerceapi.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class CustomerNotFoundException extends ResponseStatusException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(HttpStatusCode status,String msg) {
		super(status,msg);

	}
}
