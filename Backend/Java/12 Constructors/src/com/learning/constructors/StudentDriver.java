package com.learning.constructors;

public class StudentDriver {
	public static void main(String[] args) {
		Student s = new Student("Salman","A","25th August","Java");
		
		System.out.println("Name : "+s.name);
		System.out.println("Section  : "+s.section);
		System.out.println("Batch : "+s.batch);
		System.out.println("Course : "+s.course);
	}
}
