package com.learning.interface3;

//@FunctionalInterface 	// this is optional
							// when we write annotation. it says to compiler check this method it is  eighter Functional method or not
public interface IAccount extends IAccountMgmt {
	void openAccount(); // only one abstract method - Single Abstract method (SAM)

	default void addBeni() {

	}
	
}

