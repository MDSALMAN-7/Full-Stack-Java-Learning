package com.learning.constructors.This;

class StudentDeatils {
	String name;
	int age;
	
	StudentDeatils(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Student{
	public static void main(String[] args) {
		StudentDeatils sd = new StudentDeatils("Salman", 24);
		StudentDeatils sd2 = new StudentDeatils("Kamdev", 22);
		
		System.out.println("Name : "+sd.name);
		System.out.println("Age : "+sd.age);
		System.out.println("Name : "+sd2.name);
		System.out.println("Age : "+sd2.age);
	}
}

