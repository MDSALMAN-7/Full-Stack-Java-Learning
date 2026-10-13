package com.learning.constructors;

public class BasicConstructor {
	public BasicConstructor() {
		super();
		System.out.println("I am inside the constructor!");;
	}
	public static void main(String[] args) {
		BasicConstructor bc = new BasicConstructor();
		System.out.println(bc);
	}
}
