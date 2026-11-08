package com.learning.constructors2;

public class AdmissoinDriver {
	public static void main(String[] args) {
		Admisson student1 = new Admisson("Kamdev", "KW127", "Java Backend", 25000);
		Admisson student2 = new Admisson("Kamran", "KW128", "Python Backend", 28000);
		Admisson student3 = new Admisson("Salman", "KW133", "AI Eng", 29000);
		
		System.out.println("Student 1");
		System.out.println("Student Name : "+student1.studentName);
		System.out.println("Application Id : "+student1.applicationId);
		System.out.println("Course Name : "+student1.courseName);
		System.out.println("Course Fees : "+student1.fees);
		System.out.println("Student 2");
		System.out.println("Student Name : "+student2.studentName);
		System.out.println("Application Id : "+student2.applicationId);
		System.out.println("Course Name : "+student2.courseName);
		System.out.println("Course Fees : "+student2.fees);
		System.out.println("Student 3");
		System.out.println("Student Name : "+student3.studentName);
		System.out.println("Application Id : "+student3.applicationId);
		System.out.println("Course Name : "+student3.courseName);
		System.out.println("Course Fees : "+student3.fees);
	}
}
