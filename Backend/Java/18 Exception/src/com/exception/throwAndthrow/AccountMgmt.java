package com.exception.throwAndthrow;

public class AccountMgmt {
	
	public void doActivate() {
		activateAccount(null);
	}
	
	private void activateAccount(String accNo)
	{
		System.out.println("Account.activateAccount() Start");
		try {
			checkAccountStatus(null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("AccountMgmt.activateAccount() END");
	}
	
	private boolean checkAccountStatus(String accNo) throws Exception 
	{
		try {
			accNo.startsWith("SBI"); // NPE
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new Exception("Account Number is not starting with SBI");
		}
		return false;
	}
}
