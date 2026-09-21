class Driver
{
	public static void main(String[] args)
	{
		System.out.println("Driver.main() start");
		
		//class placeorder() method of OrderMgmt class 
		//creating object to access 
		OrderMgmt objMgmt = new OrderMgmt();
		
		// calling the method
		objMgmt.placeOrder("Iphone 18");
		
		// System.out.println("Order value is : "+objMgmt.orderValue);
		
		System.out.println("Driver.main() End");
 
	}
} 