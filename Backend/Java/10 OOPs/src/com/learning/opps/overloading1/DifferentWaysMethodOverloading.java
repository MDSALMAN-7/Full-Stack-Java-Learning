package com.learning.opps.overloading1;

class Payment1
{
	// 1. changing the number of parameters
	void processPayment1(int amount)
	{
		System.out.println("Processing payment of INR "+amount);
	}
	
	void processPayment1(int amount, String mode)
	{
		System.out.println("Processing INR "+amount+ " Via : "+mode);
	}
	
	// 2. Changing the type of parameter
	void processPayment1(String upiID, double amount)
	{
		System.out.println("Processing payment of INR "+amount+" From UIP ID : "+upiID);
	}
	
	//3.Changing the order of parameter
	void processPayment1(boolean confirmation, int amount)
	{
		System.out.println("Processing cash Payment of INR "+amount+"with confirmation "+confirmation);
	}
}

public class DifferentWaysMethodOverloading {

	public static void main(String[] args) {
		Payment1 payment1 = new Payment1();
		
		payment1.processPayment1(500); // calls method with 1 int parameter
		payment1.processPayment1(1000, "Net Banking"); // call method with string and in
		payment1.processPayment1("Salman@ybl", 12000); // calls method with String and double
		payment1.processPayment1(true,2000); // calls method with boolean and int
	}

}
