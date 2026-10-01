package com.salman.booking;

// this class is responsible for accepting booking from user;

public class Booking {
	
	public String doBooking(String form, String to, int noOfPnr) {
		String pnr = null;
		if(noOfPnr>6) { // if condition is true, below code will work	
			// do not allow do book
			System.err.println("As per IRCTC policiy, only 6 pax are allowed per PNR");
		}else {
			// confirming the booking
			pnr = "2345678";
			System.out.println("Confirming the Booking : "+pnr);
			System.out.println("Status is Confirmed");
			System.out.println("Seat : B3 45");
		}
		return pnr;
	}
}
