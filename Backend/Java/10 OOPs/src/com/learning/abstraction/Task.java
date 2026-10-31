/*Task:

	WAP and achieve abstraction
	
	requirement:
		- Place order will be used by other classes to place an order
		- Hide the core functionalities and expose only required functionality
		- Explore if core functionalitis are exposed to other classes and do the impact analysis.
*/

package com.learning.abstraction;

class OrderService{
	// Public method: accesible to other classes
	public void placeOrder() {
		validateOrder();
		processPayment();
		updateInventory();
		
		System.out.println("Order Placed");
	}
	
	// core functionalities 
	private void validateOrder() {
		System.out.println("Order validate ");
	}
	
	private void processPayment() {
		System.out.println("Payment Processed");
	}
	private void updateInventory() {
		System.out.println("Inventory updated");
	}
}
