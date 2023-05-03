package com.springbootcrm.error;

public class CustomerNotFoundException extends RuntimeException{
	public CustomerNotFoundException() {
		super();
	}
	public CustomerNotFoundException(String message) {
		super(message);
	}

}
