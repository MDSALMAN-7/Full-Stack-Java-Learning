package com.learning.interface2;

public class FlightBooking implements IBooking {
	@Override
	public Booking book() {
		
		return null;
	}

	@Override
	public void cancelBooking() {
		
		
	}

	@Override
	public Booking checkStatus() {
		
		return null;
	}

	@Override
	public SearchResult search() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// printTicket method
		void printTicket(String path,String contents) {
			IBooking.printTicket("", "");
		}
}
