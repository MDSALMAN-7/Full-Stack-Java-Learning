package com.string.builderbuffer;

public class StringBufferExample {
	public static void main(String[] args) {
		// create a StringBuffer with initial content
		StringBuffer sb = new StringBuffer("Kodewala Academy"); // StringBuffer object sb is created with the initial
																// string "Kodewala Academy"

		// Append Location details

		sb.append("Btm");
		sb.append("Banglore");
		
		System.out.println("Details : "+sb);
	}  
}
