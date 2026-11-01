package com.learning.interface1;

// java 1.7 or 7  OR before
public interface IDiscount {
	
	public static final int MAX_VALUE = 1000;// public static final --> constant
	
	public abstract int calculateDiscount(int amount, int rate);
	
	public abstract void calculateDiscountTax(int tax);
}
