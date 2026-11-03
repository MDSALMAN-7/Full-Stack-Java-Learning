package com.learning.interface4.lembdaExpression;

public class Driver {

	public static void main(String[] args) {
		IAccount account =  (name, acc) ->    // (->) this sign is lambda express and lambda Expression works only with functional
		{
			System.out.println("Open Account ...."+name);
			return "Account Opened";
		};
		
		String result = account.openAccount("Salman","1234567654");
	}

}
