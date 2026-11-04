package com.learning.interface2;

// This class is implementing IBooking Interface and must implement all the abstract method of
// IBooking interface. (100% Contract)
public class BusBooking implements IBooking {

	@Override
	public Booking book() {
		System.out.println("BusBooking.book()");
		return null;
	}

	@Override
	public void cancelBooking() {
		
		System.out.println("BusBooking.cancleBooking()");
	}

	@Override
	public Booking checkStatus() {
		Booking booking = new Booking();
		booking.setBookingId("MMTBB1234");
		booking.setStatus("Confirmed");
		return booking;
	}

	

	@Override
	public SearchResult search() {
		SearchResult result = new SearchResult();
		return null;
	}
	
	// printTicket method
	void printTicket(String path,String contents) {
		IBooking.printTicket("", "");
	}

}
