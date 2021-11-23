package com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name:");
		String name1 = sc.next();
		System.out.println(firstName(name1));

	}

	private static boolean firstName(String firstName) {

		return firstName.matches("^([A-Z]{1}+[a-z]{2,})*$");
	}

}