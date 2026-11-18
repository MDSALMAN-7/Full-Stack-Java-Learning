package com.exception.finally1;

public class InvoiceService {
	public void generateInvoice() {
		// get customers and order details from database
		// connect with database --> create db connection  +
		// get details from db
		
		try {
			
			connectDatabase(); // creating connection
			String name = null;
			name.lastIndexOf("a");
			System.out.println("Generating an invoice");
			// close 
			closeDbconnection();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("some exception");
			e.printStackTrace();
		}
		finally  // mandatory executeable block (Exception or NO Exception)
		{
			System.out.println("I am inside finally Block");
		}
	}

	public void closeDbconnection() {
		// TODO Auto-generated method stub
		
	}

	public void connectDatabase() {
		// TODO Auto-generated method stub
		System.out.println("Connecting database : ");
		
	}
}
