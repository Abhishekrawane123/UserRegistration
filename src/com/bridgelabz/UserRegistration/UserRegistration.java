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

	}

	private static boolean Name(String Name) {

		return Name.matches("^([A-Z]{1}+[a-z]{2,})*$");
	}
}