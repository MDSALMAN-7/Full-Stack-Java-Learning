class Account
{
	int balance =100; // instance variable
	static int intRate = 5; //static variable
	
	public static void main(String[] args)
	{
		// Creating an object of Account class
		Account acc = new Account();
		
		System.out.println("Balance is : "+acc.balance); // here i using dot(.) operator for accessing instance variable with help of object name 
		System.out.println("Rate is : "+Account.intRate); // here i using dot(.) operator for accessing static variable with the help of class name 
		
	}
	
	
	
	
}