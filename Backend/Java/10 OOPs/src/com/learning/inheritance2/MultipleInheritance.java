package com.learning.inheritance2;

class College{

	public void takeAdmission(String name, int std) {
		System.out.println("School.takeAdmissoin()");
	}

}

class SrrStudent extends College {
	@Override // Changing the super class method's functionalities.
	public void takeAdmission(String name, int std) {
		System.out.println("SrStudent.takeAdmissoin()"+name);
	}
}

class JrStudent extends College{
	@Override // Changing the super class method's functionalities.
	public void takeAdmission(String name, int std) {
		System.out.println("JrStudent.takeAdmission()");
	}
}
