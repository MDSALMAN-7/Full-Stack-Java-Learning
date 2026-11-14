package com.stringbuffer;

public class StringBufferExample {
	public static void main(String[] args) {
		//Q3. Medium – StringBuffer
		/*
		 * Ek StringBuffer object create karo with "Hello Java". - delete() use karke
		 * "Hello " remove karo. - append() se " Developer" add karo. - Final output
		 * print karo.
		 */
		
		StringBuffer sb = new StringBuffer("Hello Java");
		
		sb.delete(0, 6);
		sb.append(" Developer");
		System.out.println(sb);
	}
}
