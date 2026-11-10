package com.learning.constructors.super2;

public class Student extends Person {
	int rollNo;
	String course;
	
	public Student(int rollNo, String course, String name, int age) {
		super(name,age);
		this.rollNo = rollNo;
		this.course = course;
	}
	
	
}
