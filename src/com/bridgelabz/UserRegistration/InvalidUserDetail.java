package com.bridgelabz.UserRegistration;

public class InvalidUserDetail extends Exception {
	Invalid invalid;

	enum Invalid {
		FirstName, LastName, Email, Password, PhoneNumber
	}

	Invalid exception;

	InvalidUserDetail(Invalid exception, String message) {
		super(message);
		this.exception = exception;
	}
}