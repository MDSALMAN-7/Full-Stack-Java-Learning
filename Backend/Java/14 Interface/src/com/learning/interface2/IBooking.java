package com.learning.interface2;

public interface IBooking {
	public abstract Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	SearchResult search();
	
	// optional -- 2020
	public default void autoUpgrade()
	{
		System.out.println("IBooking.autoUpgrade()...");
	}
	
	// common or utility method
	public static void printTicket(String path, String contents) {
		System.out.println("Printing ticket... Static method...");
	}
}
