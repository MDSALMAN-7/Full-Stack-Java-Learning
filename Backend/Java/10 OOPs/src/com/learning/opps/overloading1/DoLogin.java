package com.learning.opps.overloading1;

class Login {

	// Overloading

	public void dologin(String mobile, int otp) { // v1
		System.out.println("DoLogin.doLogin()... 1st");
	}

	public String dologin(String email, String password) { // v2
		System.out.println("DoLogin.doLogin()... 2nd");
		return "Something";
	}

	public void dologin(String email) { // v3
		System.out.println("DoLogin.doLogin()... 3rd " + email);
	}
}

public class DoLogin {
	public static void main(String[] args) {
		Login login = new Login();
		login.dologin("salman.md@gamil.com", "salman234");
	}
}
