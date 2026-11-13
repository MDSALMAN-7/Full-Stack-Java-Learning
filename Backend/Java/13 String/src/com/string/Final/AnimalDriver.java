package com.string.Final;

class Animal{
	final public void eat() {
		System.out.println("Eating dog Food");
	}
}

class Dog extends Animal{
	void bark() {
		
	}
	
//	@Override
//	void eat() {
//		System.out.println("Eating normal foold");
//	}
	
}

public class AnimalDriver {
	public static void main(String[] args) {
		Dog d1 = new Dog();

        d1.eat();
        d1.bark();
	}
}
