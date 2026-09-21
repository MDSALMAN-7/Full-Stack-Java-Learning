class OrderMgmt
{
	private int orderValue = 1200;
	public void placeOrder(String itemName){
		
		OrderMgmt objMgmt = new OrderMgmt();
		
		// using private variable within the same class
		System.out.println("Order value is : "+objMgmt.orderValue);
		
		System.out.println("Placing an order for : "+itemName);
	}
} 