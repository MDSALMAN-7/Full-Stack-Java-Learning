package com.stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		/*
		 * StringBuilder sb = new StringBuilder("Hello");
		 * 
		 * sb.append("World");
		 * 
		 * System.out.println(sb);
		 */
		
		//Q2. Medium – StringBuilder
		/*
		 * Ek StringBuilder object create karo with "Programming". - insert() se
		 * starting mein "Java " add karo. - reverse() use karo. - Final output print
		 * karo.
		 */
		
		StringBuilder sb = new StringBuilder(" Programming");
		sb.insert(0,"Java");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
