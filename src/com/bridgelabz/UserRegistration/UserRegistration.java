package com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name:");
		String firstName = sc.next();
		System.out.println(Name(firstName));
		System.out.print("Enter Last Name:");
		String lastName = sc.next();
		System.out.println(Name(lastName));
		System.out.print("Enter Email:");
		String email=sc.next();
		System.out.println(isValidEmail(email));
	}

	private static boolean isValidEmail(String email) {
		
		return email.matches("^([A-Za-z]{3,})[0-9a-zA-Z]+(@)+[a-z0-9]+(.)+[a-z]{2,}$");
		
	}

	private static boolean Name(String name) {

		return name.matches("^([A-Z]{1}+[a-z]{2,})*$");
	}
}