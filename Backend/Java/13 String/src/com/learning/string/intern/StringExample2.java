package com.learning.string.intern;

public class StringExample2 {
	/*
	 * public static void main(String[] args) { String s1 = new String("Hello");
	 * String s2 = "Hello"; String s3 = s1.intern();
	 * 
	 * System.out.println(s1 == s2); // false System.out.println(s2 == s3); // true
	 * System.out.println(s1 == s3); // false }
	 */

	public static void main(String[] args) {

		// Q1.
		/*
		 * String s1 = "Java"; String s2 = new String("Java");
		 * 
		 * System.out.println(s1 == s2); // False System.out.println(s1 == s2.intern());
		 * // true
		 */

		// Q2.
		/*
		 * String s1 = "Hello"; String s2 = "Hello"; String s3 = new String("Hello");
		 * 
		 * String s4 = s3.intern();
		 * 
		 * System.out.println(s1 == s2); // true System.out.println(s2 == s3); // false
		 * System.out.println(s1 == s4); // true
		 */

		// Q3.
		/*
		 * String s1 = new String("Python"); String s2 = "Python";
		 * 
		 * System.out.println(s1.equals(s2)); // true System.out.println(s1 == s2); //
		 * false System.out.println(s1.intern() == s2); // True
		 */

		// Q4.
		/*
		 * String s1 = "Java"; String s2 = "Developer";
		 * 
		 * String s3 = s1 + s2; // Store in heap Momry String s4 = "JavaDeveloper";
		 * 
		 * System.out.println(s3 == s4); // False System.out.println(s3 == s4.intern());
		 * // false System.out.println(s3.equals(s4)); // true
		 */

		// Q5.
		/*
		 * String s1 = new String("Spring"); String s2 = new String("Spring");
		 * 
		 * String s3 = s1.intern(); String s4 = s2.intern();
		 * 
		 * System.out.println(s1 == s2); // false System.out.println(s3 == s4); // True
		 * System.out.println(s1.equals(s2)); // True
		 */

		// Q6.
		/*
		 * String s1 = "Full"; String s2 = "Stack";
		 * 
		 * String s3 = s1 + s2; String s4 = "FullStack"; String s5 = s3.intern();
		 * 
		 * System.out.println(s3 == s4); // False System.out.println(s4 == s5); // True
		 * System.out.println(s3 == s5); // False
		 */

		// Q7.
		/*
		 * String s1 = "Java"; String s2 = "Full"; String s3 = "Stack";
		 * 
		 * String s4 = s1 + s2 + s3; String s5 = "JavaFullStack";
		 * 
		 * String s6 = s4.intern();
		 * 
		 * System.out.println(s4 == s5); // False System.out.println(s5 == s6); // True
		 * System.out.println(s4 == s6); // False
		 */	
		
		//Q8.
		/*
		 * String s1 = "Hello"; String s2 = new String("Hello"); String s3 = new
		 * String("Hello");
		 * 
		 * String s4 = s2.intern(); String s5 = s3.intern();
		 * 
		 * System.out.println(s1 == s2); // False System.out.println(s2 == s3); // false
		 * System.out.println(s1 == s4); // True System.out.println(s4 == s5); // True
		 * System.out.println(s2.equals(s3)); //True
		 */	
		
		// Q9.
	}
}
