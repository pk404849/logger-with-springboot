package com.org.exception;

public class EmployeeException extends Exception {

	private static final long serialVersionUID = -3454562557457118799L;

	private String message;

	public EmployeeException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
