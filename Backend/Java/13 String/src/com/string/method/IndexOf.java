package com.string.method;

public class IndexOf // Returns the first occurrence index of a substring.
{
	public static void main(String[] args) {
		String str = "Learning";
		
		System.out.println(str.indexOf("r")); // 3
		
		System.out.println(str.indexOf("M")); // Return -1 if index is not found.
	}
}
