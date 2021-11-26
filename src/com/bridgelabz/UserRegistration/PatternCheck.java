package com.bridgelabz.UserRegistration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatternCheck {
	public static PatternCheck instance;
	private static final String EMAIL_PATTERN = "^[0-9a-zA-Z+-._]+@[0-9a-zA-Z]+.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	private static final String NAME_PATTERN = "^([A-Z]{1}+[a-z]{2,})*$";
	private static final String PHONE_NUMBER_PATTERN = "^([0-9]{1,2})\\s([0-9]{10})$";
	private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@|#|$|%|^|&|-|+|=|(|)|])(?=\\S+$).{8,}$";
	Scanner sc = new Scanner(System.in);

	private PatternCheck() {

	}

	public static PatternCheck getInstance() {
		if (instance == null) {
			instance = new PatternCheck();
		}
		return instance;
	}

	public boolean addFirstName(String FirstName) 
	{
		UserRegistration userData = UserRegistration.getInstance();
		userData.setFirstName(FirstName);
		boolean check = userData.getFirstName().matches(NAME_PATTERN);
		if (check == true) 
		{
			System.out.println("Pattern Match For First Name");
			return true;
		}
		else 
		{
			System.out.println("Invalid Name format \nAdd again (Eg:Abhi)");
			
		}
		return false;
	}

	public boolean addLastName(String LastName) 
	{
		UserRegistration userData = UserRegistration.getInstance();
		userData.setLastName(LastName);
		boolean check = userData.getLastName().matches(NAME_PATTERN);
		if (check == true) 
		{
			System.out.println("Pattern Match For Last Name");
			return true;
		}
		else 
		{
			System.out.println("Invalid Name format \nAdd again (Eg:Rawane)");
			
		}
		return false;
	}

	public boolean addEmail(String Email) 
	{
		UserRegistration userData = UserRegistration.getInstance();
		userData.setEmail(Email);
		boolean check = userData.getEmail().matches(NAME_PATTERN);
		if (check == true) 
		{
			System.out.println("Pattern Match For Email");
			return true;
		}
		else 
		{
			System.out.println("Invalid Name format \nAdd again (Eg:abhishekrawane1195@gmail.com)");
			
		}
		return false;
	}
	public boolean addPhoneNumber(String PhoneNumber) 
	{
		UserRegistration userData = UserRegistration.getInstance();
		userData.setPhoneNumber(PhoneNumber);
		boolean check = userData.getPhoneNumber().matches(NAME_PATTERN);
		if (check == true) 
		{
			System.out.println("Pattern Match For PhoneNumber");
			return true;
		}
		else 
		{
			System.out.println("Invalid Name format \nAdd again (Eg:8269585463)");
			
		}
		return false;
	}

	public boolean addPassword(String Password) 
	{
		UserRegistration userData = UserRegistration.getInstance();
		userData.setPassword(Password);
		boolean check = userData.getPassword().matches(NAME_PATTERN);
		if (check == true) 
		{
			System.out.println("Pattern Match For Password");
			return true;
		}
		else 
		{
			System.out.println("Invalid Name format \nAdd again");
			
		}
		return false;
	}

	public boolean readFile() throws FileNotFoundException
	{
	     File file = new File("C:\\Users\\ABHISHEK RAWANE\\eclipse-workspace\\UserRegistration\\src\\com\\bridgelabz\\UserRegistration\\differentEmailsResults.txt");
				
		Scanner sf = new Scanner(file);

		String emails = null;
		while (sf.hasNextLine())
			emails = sf.nextLine();
		System.out.println("Total email:-\n" + emails);

		String[] emailArr = emails.split(",");
		List<String> validEmail = new ArrayList<>();
		List<String> invalidEmail = new ArrayList<>();

		for (String a : emailArr) {
			boolean check = a.matches(EMAIL_PATTERN);
			if (check == true) {
				validEmail.add(a);

			}
			else 
			{
				invalidEmail.add(a);
			}
		}
		System.out.println("\n-Valid Email- :");
		for (String a : validEmail)
			System.out.println(a);

		System.out.println("\n-InValid Email- :");
		for (String a : invalidEmail)
			System.out.println(a);
		sf.close();
		return false;
	}
}