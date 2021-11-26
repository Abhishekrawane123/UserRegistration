package com.bridgelabz.UserRegistration;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

		public String firstName, lastName, email, password, phoneNumber;
	

		public static void main(String[] args) throws FileNotFoundException {
			UserRegistration user=new  UserRegistration();
			UserRegistration userData=UserRegistration.getInstance();
	    
			PatternCheck pc = PatternCheck.getInstance();
			pc.addFirstName("Abhi"); 
			pc.addLastName("Rawane");
			pc.addEmail("abhishekrawane1195@gmail.com");
			pc.addPhoneNumber("8269585463");
			pc.addPassword("Raw123*");
	
			
	
//			userValidation.addEmail(); // Email Adding
//			user.email = userData.getEmail();
	//
//			userValidation.addPhoneNumber(); // Phone Number Adding
//			user.phoneNumber = userData.getPhoneNumber();
	//
//			userValidation.addPassword(); // Password Adding
//			user.password = userData.getPassword();
//			user.display();
		}

		private void display() {
			System.out.println("\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName + "\n\tEmail : "
					+ email + "\n\tPhone Number : " + phoneNumber + "\n\tPassword : " + password);
		}
	}
