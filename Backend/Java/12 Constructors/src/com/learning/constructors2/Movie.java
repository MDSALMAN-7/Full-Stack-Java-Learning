package com.learning.constructors2;

public class Movie {
	String movieName;
	String director;
	double rating;
	int realseYear;
	public Movie(String movieName, String director, double rating, int realseYear) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.rating = rating;
		this.realseYear = realseYear;
	}
	
	Movie(){
		
	}
}
