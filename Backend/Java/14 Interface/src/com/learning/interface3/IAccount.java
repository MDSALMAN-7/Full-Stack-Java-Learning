package com.learning.interface3;

//@FunctionalInterface 		// this will force you to have only one abstract
							// this is optional
							// From java 8 introduce
							// when we write annotation. it says to compiler check this method it is  eighter Functional method or not
public interface IAccount  {
	String openAccount(String name, String address, int pin); // only one abstract method - Single Abstract method (SAM)
	
}

