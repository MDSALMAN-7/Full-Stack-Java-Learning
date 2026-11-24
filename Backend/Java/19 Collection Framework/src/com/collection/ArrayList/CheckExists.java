package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CheckExists {
	public static void main(String[] args) {
		List<String> learners = new ArrayList<String>();
		
		learners.add("Kamdev");
		learners.add("Sonu");
		learners.add("Somu");
		learners.add("salman");
		learners.add("kamran");
		learners.add("vijay");
		learners.add("salman");
		learners.add(null);
		
		System.out.println(learners.contains("salman"));
		
		
	}
}
