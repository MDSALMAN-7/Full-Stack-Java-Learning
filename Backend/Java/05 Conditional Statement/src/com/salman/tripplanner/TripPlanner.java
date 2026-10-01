package com.salman.tripplanner;

public class TripPlanner {
	public String suggestPlan(String src, String dest, int budget)
	{
		String suggestion = null;
		if(budget<=1000) {
			System.out.println("You can go mini Kormangla");
		}
		else if(budget>1000 && budget<=3000) {
			System.out.println("you can go real kormangla and enjoying pubing");
		}
		else if(budget>3000 && budget <=5000) {
			System.out.println("you can hire a texi and visit banglore and watching movie");
		}
		else {
			System.out.println("You can visit goa");
		}
		return suggestion;
	}
}
