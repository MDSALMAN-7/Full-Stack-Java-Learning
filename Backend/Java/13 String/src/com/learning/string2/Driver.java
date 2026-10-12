package com.learning.string2;

public class Driver {
	public static void main(String[] args) {
		//String s = "kodewala"; // SCP memory Adress -> 123qwe
		
		//String s2 = new String("Academy"); //  ONe object in SCP+ one In Heap --> 1234cj
		
		String k1 = "kumar"; //it will goes to SCP(String contant Pool)
		String k2 = "kumar";
		
		String k3 = new String("kumar"); // it will create new adress in heap memory
		String k4 = new String("kumar");
		
		System.out.println(k1 == k2); // will get true because different reference value with same object
		System.out.println(k4 == k3); // will get false because compering with differnt adress of object
		
		
		System.out.println(k4.equals(k4)); // it checks only content.
	}
}

