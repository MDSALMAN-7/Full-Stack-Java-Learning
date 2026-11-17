package com.exception.multiplecatch;

public class Employee {
	public static void main(String[] args) {
		EmpDetails emp = new EmpDetails();
		
		emp.doOperation();
	}
}

class EmpDetails{
	String[] employees = {"Salman", "Rahul", "Amit", "John"};
	
	int num = 30;
	
	void doOperation() {
		try {
//			int result = num / 2;
//			System.out.println("Result : "+result);
			
//			System.out.println("Employee Name : "+employees[7]);
			int result = num / 2;
			System.out.println("Employee Name : " + employees[1]);
			
		} catch (ArithmeticException e) {
			System.out.println("Fix you integer value");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong accessing");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Unknown Exception");
		}
		
		System.out.println("Employee processing completed");
	}
	
	
}
