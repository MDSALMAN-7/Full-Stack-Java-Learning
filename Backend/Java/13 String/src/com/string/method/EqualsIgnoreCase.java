package com.string.method;

public class EqualsIgnoreCase // Compares tow strings, ignoring case.
{
	public static void main(String[] args) {
		String s1 = "Salman";
		String s2 = "SalMan";
		
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
