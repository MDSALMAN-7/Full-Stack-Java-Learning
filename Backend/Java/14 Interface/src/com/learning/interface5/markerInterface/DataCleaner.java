package com.learning.interface5.markerInterface;

public class DataCleaner {
	public void clean(Object obj) // Object obj = new User();
	{
		if(obj instanceof Cleanable) {
			System.out.println("Allowed");
		}
		else {
			System.err.println("Not allowed");
		}
	}
}
