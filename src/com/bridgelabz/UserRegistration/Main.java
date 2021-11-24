package com.bridgelabz.UserRegistration;

public class Main {

	public static void main(String[] args) {

		PatternCheck check = new PatternCheck();
		check.firstNamePattern();
		check.lastNamePattern();
		check.emailIdPattern();
		check.phoneNumber();
		check.passwordPattern();
		
		check.printResult();
	}
}