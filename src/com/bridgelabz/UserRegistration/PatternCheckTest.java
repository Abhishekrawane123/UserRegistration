package com.bridgelabz.UserRegistration;

import java.io.FileNotFoundException;

import org.junit.Test;

public class PatternCheckTest 
{

	@Test
	 public void FirstName_test()
	 {
		PatternCheck pc = PatternCheck.getInstance();
         boolean result = pc.addFirstName("Abhi");
	 }
	
	@Test
	 public void LastName_test()
	 {
		PatternCheck pc = PatternCheck.getInstance();
        boolean result = pc.addLastName("Rawane");
	 }
	
	@Test
	 public void Email_test()
	 {
		PatternCheck pc = PatternCheck.getInstance();
       boolean result = pc.addEmail("abhishekrawane1195@gmail.com");
	 }
	
	@Test
	 public void PhoneNumber_test()
	 {
		PatternCheck pc = PatternCheck.getInstance();
       boolean result = pc.addPhoneNumber("8269585463");
	 }
	
	@Test
	 public void Password_test()
	 {
		PatternCheck pc = PatternCheck.getInstance();
       boolean result = pc.addPassword("Raw123*");
	 }
	
	@Test
	 public void readFile() throws FileNotFoundException
	 {
		PatternCheck pc = PatternCheck.getInstance();
      boolean result = pc.readFile();
	 }
}
