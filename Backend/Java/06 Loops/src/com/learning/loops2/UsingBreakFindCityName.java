package com.learning.loops2;

public class UsingBreakFindCityName {
	public static void main(String[] args) {
		String[] cities = { "Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai", "Kolkata", "Pune", "Ahmedabad",
				"Jaipur", "Lucknow", "Surat", "Kanpur", "Nagpur", "Indore", "Bhopal", "Patna", "Noida", "Gurgaon",
				"Chandigarh", "Varanasi" };
		// finding bangalore is a part of the list or not

		for (int i = 0; i < cities.length; i++) {
			String currentCities = cities[i];
			if(currentCities.equals("Bangalore")) {
				System.out.println("Yes it a part of list");
				break; // Break the loop -> you will come out the loop
			}
		}

	}

}
