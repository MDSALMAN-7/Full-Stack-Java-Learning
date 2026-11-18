package com.exception.finally1;

public class MobileActivation {
	public static void main(String[] args) {
		System.out.println("Main Start");
		Activate active = new Activate();
		
		active.doActivate();
		System.out.println("Main End");
	}
}

class Activate{
	String number = "8271718989";
	
	public void doActivate() {
		try {
			validateNumber();
		} catch (NullPointerException e) {
			System.out.println("please you invalid number :");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Unknown Error");
			e.printStackTrace();
			
		} finally
		{
			System.out.println("Mobile activation process completed");
		}
	}
	
	public void validateNumber() {
		int findlength = number.length();
		System.out.println("Length : "+findlength);
		
		System.out.println("Starts with : "+number.startsWith("620"));
		
		System.out.println("Five character extract : "+number.substring(0, 5));
		
		System.out.println("No. 6 index : "+number.charAt(12));
	}
}
