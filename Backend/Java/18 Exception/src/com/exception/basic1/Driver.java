package com.exception.basic1;

public class Driver {
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		
		String mobileNum = "765567896";
		
		String[] location = {"BTM","JP Nagar"};
		
		mob.doActivateNum(mobileNum,location);
	}
}
class Mobile
{
	public void doActivateNum(String mobileNum, String location[]) {
		System.out.println("Mobile.doActivateNum() Start");
		validateNumDetails(mobileNum,location);
		System.out.println("Mobile.doActivateNum() Start");
	}
	
	private boolean validateNumDetails(String mobileNum, String location[]) {
		
		System.out.println("Mobile.validateNumDetails() Start");
		System.out.println("Validating account deatils..");
		System.out.println("checking number status");
		
		int numberType = 1;
		String companyName = "Jio";
		boolean isActive = true;
		
		System.out.println("NumberType : "+numberType);
		System.out.println("Company Name : "+companyName);
		System.out.println("Number Active  : "+isActive);
		boolean isValid = false;
		
		try {
			String locationAdress = location[1];
			System.out.println("Loction : "+locationAdress);
			isValid = mobileNum.startsWith("SBI"); // NPE if account number is null --> Is this risky code ?
//			int amount = 100/0; // ArithmeticException 
            int mobileNumInt =  Integer.parseInt(mobileNum); // 
			
		}
		catch (NullPointerException e)  // Child
		{ // This block will catch any of the exception Object
			System.out.println(" Values is null");
			e.printStackTrace();

		} 
		catch (ArrayIndexOutOfBoundsException e) // Child
		{
			System.out.println(" You are trying to get an values from invalid index");
			e.printStackTrace();
		}
		catch (ArithmeticException e) { // Child
			System.out.println(" ArithmeticException .. number / by zero");
			e.printStackTrace();
		}
		System.out.println("Account validation completed");
		System.out.println("Account.validateAccDetails() END");

		return isValid;
	}
}
