package com.string.builderbuffer;

public class MobileNumberFormatter {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("9987654325");
		
		sb.insert(5, " ");
		System.out.println(sb);
	}
}
