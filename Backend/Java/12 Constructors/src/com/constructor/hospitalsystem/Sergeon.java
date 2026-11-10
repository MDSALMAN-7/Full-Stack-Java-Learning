package com.constructor.hospitalsystem;

public class Sergeon extends Doctor {
	String surgeryType;
	int operationFee;
	public Sergeon(String surgeryType, int operationFee,String specialization, int experience,String name,int age) {
		super(specialization, experience, name, age);
		this.surgeryType = surgeryType;
		this.operationFee = operationFee;
	}
	
	
}
