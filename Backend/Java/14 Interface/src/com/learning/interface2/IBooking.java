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
	
	public default void sendNotification() {
		// 500 lines(checking status, connection with database,upgrading)
		System.out.println("IBooking.sendNotification()...");
	}
	
	private void connectToDB() {
		System.out.println("IBooking.connectToDB()");
	}
	
	// common or utility method
	public static void printTicket(String path, String contents) {
		System.out.println("Printing ticket... Static method...");
	}
	
	// FAQ: why do we need static,
	//		why do we need default method
	//  	What is the purpose of private method in interface
}
