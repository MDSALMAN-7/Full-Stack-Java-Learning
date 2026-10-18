package com.learning.inheritance2;

class School {

	public void takeAdmission(String name, int std) {
		System.out.println("School.takeAdmissoin()");
	}

}

class SrStudent extends School {
	@Override // Changing the super class method's functionalities.
	public void takeAdmission(String name, int std) {
		System.out.println("Teacher.teaching()");
	}
}
