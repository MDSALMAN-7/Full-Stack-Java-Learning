package com.learning.interface1;

public class FlightBooking implements IDiscount
{
	@Override
	public int calculateDiscount(int amount, int rate) {
		int finalPrice = amount - (amount*rate)/100;
		
		return finalPrice;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		// TODO Auto-generated method stub
		
	}
	
}
