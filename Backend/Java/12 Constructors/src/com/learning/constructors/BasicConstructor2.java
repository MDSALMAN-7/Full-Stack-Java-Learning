package com.learning.constructors;

public class BasicConstructor2 extends Object {
	public BasicConstructor2() {
		super();
		System.out.println("i am inside the constructor! ..");
	}
	public static void main(String[] args) {
		BasicConstructor2 bs = new BasicConstructor2();
		System.out.println(bs);
	}
}
