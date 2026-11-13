package com.string.Final;

class StudentDetails{
	final int rollNo = 101;

    void display() {
        System.out.println("Roll Number: " + rollNo);
    }

    void changeRollNo() {
        // rollNo = 102; // Compilation error
    }
}

public class Student {
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();

        s1.display();
	}
}
