package com.learning.interface2;

public class Driver {
	public static void main(String[] args) {
		IBooking booking = new TrainBooking();
		booking.autoUpgrade();
	}
}
