package com.learning.opps.polymorphism1;

// Parent class representing a Person
class Person {
	void showRole() {
		System.out.println("I am a person with multiple roles.");
	}
}

// Child class representing a Boyfriend 
class Student extends Person {
	@Override
	void showRole() {
		System.out.println("I am a Student. I study and attend classes.");
	}
}

// child class representing a Boyfriend
class Boyfriend extends Person {
	@Override
	void showRole() {
		System.out.println("I am a Boyfriend. I spend my time with my partner.");
	}
}

class Son extends Person{
	@Override
	void showRole() {
		System.out.println("I am a son");
	}
}
public class PolymorphismExample {
	public static void main(String[] args) {
		// Reference of type Person pointing to different subclass objects
		Person person;

		person = new Student();// At the runtime, method would be called based on the actural tpe of the
								// object(Student, Boyfriend etc)
		person.showRole();
		
		person = new Boyfriend();
		person.showRole();
		
		
		person = new Son();
		person.showRole();
		
	}
}
