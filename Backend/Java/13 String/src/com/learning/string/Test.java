package com.learning.string;

public class Test {
	public static void main(String[] args) {
		String s = new String("Ja")+ new String("va");
		s.intern();
		
		String s1 = "Java";
		System.out.println(s == s1);
		
		String n = "a";
		String n1 = "b";
//		System.out.println(n+n1);
//		String n2= n.concat(n1);
//		System.out.println(n2);
		
		StringBuilder sb = new StringBuilder("kand");
		sb.append("lala");
		System.out.println(sb);
		
		
		
	}
}
