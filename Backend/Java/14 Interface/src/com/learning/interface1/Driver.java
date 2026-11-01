package com.learning.interface1;

public class Driver {
	public static void main(String[] args) {
		IDiscount dis = new FlightBooking();
		int result = dis.calculateDiscount(5000, 10);
		System.out.println(result);
				
	}
}
