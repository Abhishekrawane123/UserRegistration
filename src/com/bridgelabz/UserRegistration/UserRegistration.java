package com.bridgelabz.UserRegistration;

public class UserRegistration 
{
		public static UserRegistration instance;
		private String firstName;
		private String lastName;
		private String email;
		private String password;
		private String phoneNumber;

		public UserRegistration() {

		}

		public static UserRegistration getInstance() {
			if (instance == null) {
				instance = new UserRegistration();
			}
			return instance;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

}