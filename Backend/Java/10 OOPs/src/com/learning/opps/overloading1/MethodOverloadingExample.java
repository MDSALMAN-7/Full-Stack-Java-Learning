package com.learning.opps.overloading1;

class Registration{
	// Method 1: Registration using Aadhar
	void doRegistration(String aadhar) {
		System.out.println("Registered using Aadhar: "+aadhar);
	}
	
	// Method 2: Registration using mobile and OTP(Different number of Parameter)
	void doRegistration(String number, int otp) {
		System.out.println("Registered using Mobile : "+ number +" with OTP "+otp);
	}
	
	// Method 3: Registration using name and email (Different type of Parameter)
	void doRegistration(String name, String emial) {
		System.out.println("Registered using email : "+ name +" with OTP "+emial);
	}
}

public class MethodOverloadingExample {
	public static void main(String[] args) {
		Registration reg = new Registration();
		reg.doRegistration("123456789987"); //Call method 1
	}
}
