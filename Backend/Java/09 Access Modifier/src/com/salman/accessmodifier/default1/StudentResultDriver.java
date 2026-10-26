package com.salman.accessmodifier.default1;

public class StudentResultDriver {
	public static void main(String[] args) {
		Student s = new Student();
		s.stuName = "Salman";
		s.calculatePercentage(new int[] {34,56,78});
		s.displayResult();
	}
}
