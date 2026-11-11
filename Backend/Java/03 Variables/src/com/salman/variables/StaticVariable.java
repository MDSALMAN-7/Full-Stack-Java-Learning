package com.salman.variables;

public class StaticVariable {
	static int balance = 200;
	public static void main(String[] args) {
		System.out.println("Balance : "+balance);
		
		System.out.println("Using Class Name : "+StaticVariable.balance);
		
		StaticVariable2 sv2 = new StaticVariable2(24, "Salman");
		
		System.err.println(sv2.name);
		
	}
}
