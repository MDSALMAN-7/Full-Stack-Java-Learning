package com.salman.accessmodifier.default1;

class Student{
	String stuName;
	int[] marks;
	int totalMarks;
	double percentage;
	
	void calculatePercentage(int[] marks) {
		totalMarks = 0;
		for(int i=0; i<marks.length; i++) {
			totalMarks += marks[i];
		}
		
		percentage = totalMarks/3.0;
//		System.out.println("Percentage : "+percentage);
	}
	
	void displayResult() {
		System.out.println("Student Name : "+stuName);
		System.out.println("Percentage : "+percentage);
	}
}
