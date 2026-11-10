package com.constructor.hospitalsystem;

public class Driver {
	public static void main(String[] args) {
		Sergeon surgeon = new Sergeon("General", 20000, "Operation", 20, "kamdev", 24);
		System.out.println(surgeon.age);
	}
}
