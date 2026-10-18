package com.salman.accessmodifier.default1;

// same package
public class Order {

	public static void main(String[] args) {
	
		// Creating an object of Customer Class
		Customer customer = new Customer();
		
		// Accessing default access members within the same package
		 customer.sayHello("Salman");
		 System.out.println("Customer Name : "+customer.customerName);
	}

}
