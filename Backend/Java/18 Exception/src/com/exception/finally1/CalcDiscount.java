package com.exception.finally1;

public class CalcDiscount {
	public static void main(String[] args) {
		CalcDiscount cd = new CalcDiscount();
		
		System.out.println(cd.calcDiscount(100, 15));
	}
	
	private int calcDiscount(int amount, int disc) {
		int finalAmt = 0;
		
		try {
			finalAmt = amount - (amount * disc /100);  // risky line 
			return finalAmt;  // return baluse has been decided
		} catch (Exception e) {
			System.out.println("Some exception .... ");
			e.printStackTrace();
		} finally
		{
			finalAmt = 110;
			return finalAmt;  // jab bhi final block m return karoge ye override karega always
		}
//		return finalAmt;
	}
}

