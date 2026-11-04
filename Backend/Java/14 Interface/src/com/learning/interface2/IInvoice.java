package com.learning.interface2;

// Functional Interface
//public interface IInvoice {
//	void doInvoice();
//}

// Now its become normal interface
public interface IInvoice{
	public abstract void doInvoice();
	public abstract void cancelInvoice();
}

class Invoice implements IInvoice
{
	// Override is optional for writing here
	public void doInvoice()  // if we dont write public it will give error
	{
		
	}

	@Override
	public void cancelInvoice() {
		// TODO Auto-generated method stub
		
	}
}