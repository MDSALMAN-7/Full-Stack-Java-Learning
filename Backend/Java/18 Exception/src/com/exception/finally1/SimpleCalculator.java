package com.exception.finally1;

public class SimpleCalculator {
	public static void main(String[] args) {
		Operation opr = new Operation();
		opr.doOperation();
	}
}

class Operation{
	
	
	public void doOperation() {
		int num1 = 10;
		int num2 = 10;
		
		try {
			int result = num1/0;
			System.out.println("Result"+result);
			
			int result1 = num2/2;
			System.out.println("Resutl 2"+ result1);
		} catch (ArithmeticException e) {
			System.out.println("Tumne galat number use kiye h");
			e.printStackTrace();
		}finally
		{
			num1 = 10;
			num2 = 10;
			System.out.println(num1+" "+num2);
		}
		
		System.out.println("Calculation completed...");
	}
}
