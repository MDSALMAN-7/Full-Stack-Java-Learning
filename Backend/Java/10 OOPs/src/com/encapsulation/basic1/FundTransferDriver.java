package com.encapsulation.basic1;

public class FundTransferDriver {
	public static void main(String[] args) {
		FundTransfer ft = new FundTransfer("Salman", "9834562577", 56765);
		
		ft.doDebit(12000);
		
		System.out.println(ft.getBalance());
	}
}
