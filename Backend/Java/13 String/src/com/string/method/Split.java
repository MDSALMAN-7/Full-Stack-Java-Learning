package com.string.method;

// split (String regex): splits the string into an array of substrings based on a delimiter(i.e, |$ # etc).
public class Split {
	public static void main(String[] args) {
		String str = "Java Learning, BTM, Banglore";
		
		String[] language = str.split(",");  // Splitting based on comma
		
		for(String lang : language)
		{
			System.out.println(lang);
		}
	}
}
