package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name:");
		String firstName = sc.next();
		System.out.println(isValidName(firstName));
		System.out.print("Enter Last Name:");
		String lastName = sc.next();
		System.out.println(isValidName(lastName));
		System.out.print("Enter Email:");
		String email=sc.next();
		System.out.println(isValidEmail(email));
		System.out.print("Enter PhoneNumber:");
		String phoneNumber=sc.nextLine();
		System.out.println(isValidPhoneNumber(phoneNumber));
	}

	private static Boolean isValidPhoneNumber(String phoneNumber) {
		Pattern p=Pattern.compile("^([0-9]{1,2})\\s([0-9]{10})$");
		Matcher matcher=p.matcher(phoneNumber);	
		return matcher.matches();
	}

	private static Boolean isValidEmail(String email) {	
		
		return email.matches("^([A-Za-z]{3,})[0-9a-zA-Z]+(@)+[a-z0-9]+(.)+[a-z]{2,}$");
		
	}

	private static Boolean isValidName(String name) {

		return name.matches("^([A-Z]{1}+[a-z]{2,})*$");
	}
}