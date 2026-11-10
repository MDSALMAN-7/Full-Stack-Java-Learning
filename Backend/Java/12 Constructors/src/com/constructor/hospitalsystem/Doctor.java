package com.constructor.hospitalsystem;

public class Doctor extends Person {
	String specialization;
	int experience;
	
	public Doctor(String specialization, int experience,String name,int age) {
		super(name,age);
		this.specialization = specialization;
		this.experience = experience;
	}
	
}
