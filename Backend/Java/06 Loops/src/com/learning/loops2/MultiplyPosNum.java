package com.learning.loops2;

public class MultiplyPosNum {
	public static void main(String[] args) {
		int[] numbers = { 10, -5, 25, -12, 8, -30, 15, -7, 42, -18, 5, -25, 33, -10, 20, -3, 50, -15, 7, -40 };
		
		for(int i =0; i<numbers.length; i++ ) {
			int currentNumber = numbers[i];
			if(currentNumber<0) {
				continue;
			}
			System.out.println(numbers[i]*10);
			
		}
	}
}
