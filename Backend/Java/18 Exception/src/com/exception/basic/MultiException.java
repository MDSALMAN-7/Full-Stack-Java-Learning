package com.exception.basic;

public class MultiException {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		try {
			int result =a/b;
			System.out.println(result);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("not possible divisoin");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
}
