package com.string.builderbuffer;

public class EmailSubjectGenerator {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("meeting");
		
		sb.insert(0,"Project ");
		sb.append(" Scheduled");
		System.out.println(sb);
	}
}
