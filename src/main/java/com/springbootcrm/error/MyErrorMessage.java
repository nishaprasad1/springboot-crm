package com.springbootcrm.error;

import org.springframework.http.HttpStatus;

public class MyErrorMessage {

	private HttpStatus status;
	private String message;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MyErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public MyErrorMessage() {
		super();
	}

	@Override
	public String toString() {
		return "MyErrorMessage [status=" + status + ", message=" + message + "]";
	}
	
}
