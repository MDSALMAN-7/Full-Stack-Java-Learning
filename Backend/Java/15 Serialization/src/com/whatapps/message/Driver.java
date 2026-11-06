package com.whatapps.message;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {
		MessageSerialization messageSerialization = new MessageSerialization();
		
		Message message = new Message("MSG1","How are you ?","User@123");
		
		messageSerialization.serializeMsg(message);
//		System.out.println(message);
	}
}
