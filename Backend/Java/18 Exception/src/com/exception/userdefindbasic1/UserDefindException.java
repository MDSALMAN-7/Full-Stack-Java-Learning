package com.exception.userdefindbasic1;

class UserAlreadyExists extends Exception
{
	public UserAlreadyExists(String message) {
		super(message);
	}
}

public class UserDefindException {
	public static void main(String[] args) throws UserAlreadyExists {
		try {
			String user = "Java";
			if(user.equals("JavA")) {
				throw new UserAlreadyExists("User is avlaibel");
			}
			else {
				System.out.println("gop gps");
			}
		} catch (UserAlreadyExists e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
}
