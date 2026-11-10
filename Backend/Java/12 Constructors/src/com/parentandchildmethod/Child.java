package com.parentandchildmethod;

public class Child extends Parent {
	@Override
	public void showMessage() {
		super.showMessage();
		System.out.println("I am child class");
	}
}
