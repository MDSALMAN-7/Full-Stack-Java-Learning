package com.string.builderbuffer;

public class LogMessageGenerator {
	public static void main(String[] args) {
		StringBuilder log = new StringBuilder("ERROR: Database connection failed");
		
		log.replace(0,5,"WARNING");
		
		log.append(" - Please check the server");
		System.out.println(log);
	}
}
