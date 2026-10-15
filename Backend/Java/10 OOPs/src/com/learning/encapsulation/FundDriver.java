package com.learning.encapsulation;

public class FundDriver {
	public static void main(String[] args) {
		FundTransfer fd = new FundTransfer("Salman","9876543234567",12345,677);
//		payment.balance = 200000;
		fd.doDebit(12300);
		fd.doCredit(0);
//		fd.getBalance();
//		System.out.println();
		System.out.println(fd.getBalance());
	}
}

