package com.learning.constructors2;

public class MovieDriver {
	public static void main(String[] args) {
		Movie movieD1 = new Movie();
		Movie movieD2 = new Movie();
		
		Movie movieP1 = new Movie("Jawan", "Kamdev Kumar Rana", 9.1, 2024);
		Movie movieP2 = new Movie("Pushpa", "Kamdev Kumar Rana", 9.1, 2025);
		
		System.out.println("------Default Constructor------");
		System.out.println("Movie Name : "+movieD1.movieName);
		System.out.println("Director : "+movieD1.director);
		System.out.println("Rating : "+movieD1.rating);
		System.out.println("Realese Year : "+movieD1.realseYear);
		System.out.println();
		System.out.println("Movie Name : "+movieD2.movieName);
		System.out.println("Director : "+movieD2.director);
		System.out.println("Rating : "+movieD2.rating);
		System.out.println("Realese Year : "+movieD2.realseYear);
		System.out.println();
		System.out.println("------Parameterize Constructor------");
		System.out.println("Movie Name : "+movieP1.movieName);
		System.out.println("Director : "+movieP1.director);
		System.out.println("Rating : "+movieP1.rating);
		System.out.println("Realese Year : "+movieP1.realseYear);
		System.out.println();
		System.out.println("Movie Name : "+movieP2.movieName);
		System.out.println("Director : "+movieP2.director); 
		System.out.println("Rating : "+movieP2.rating);
		System.out.println("Realese Year : "+movieP2.realseYear);
		
		
	}
}
