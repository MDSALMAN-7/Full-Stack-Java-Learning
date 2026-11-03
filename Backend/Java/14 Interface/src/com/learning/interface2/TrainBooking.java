package com.learning.interface2;

public class TrainBooking implements IBooking {

	@Override
	public Booking book() {
		System.out.println("TrainBooking.book()");
		Booking booking = new Booking();

		booking.setBookingId("BK101");
		booking.setStatus("Confirmed");
		booking.setPassengerName("Salman");
		booking.setSource("Bengaluru");
		booking.setDestination("Home");

		booking.setTicketPrice(2200.00);
		booking.setPaymentStatus("Paid");
		booking.setSeatNumber("B 34");

		return booking;
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
		return null;
	}

	@Override
	public void autoUpgrade() {
		// code to do upgrade
		System.out.println("TrainBooking.autoUpgrade()");
	}

	// printTicket method
	void printTicket(String path, String contents) {
		// 123 lines --> printing the ticket
	}
}
