package com.abstraction.EmployeeOnboardingSystem;

public class EmployeeOnboarding {
	public boolean onboardEmployee(String name, String email, String empid) {
		connectHRDatabase();
		validateEmployeeDetails(name, email);
		verifyEmployeeId(empid);
		generateCredentials();
		sendWelcomeEmail();
		return true;
	}
	
	private boolean connectHRDatabase() {
		System.out.println("EmployeeOnboarding.connectHRDatabase()...");
		return true;
	}
	private boolean validateEmployeeDetails(String name, String email){
		System.out.println("EmployeeOnboarding.validateEmployeeDetails()...");
		return true;
	}
	private boolean verifyEmployeeId(String empid){
		System.out.println("EmployeeOnboarding.verifyEmployeeId()...");
		return true;
	}
	private boolean generateCredentials() {
		System.out.println("EmployeeOnboarding.generateCredentials()...");
		return true;
	}
	private boolean sendWelcomeEmail() {
		System.out.println("EmployeeOnboarding.sendWelcomeEmail()...");
		return true;
	}
}
