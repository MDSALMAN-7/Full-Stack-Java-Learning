package com.whatapps.message1;

import java.io.IOException;

public class Driver1 {

	public static void main(String[] args) throws IOException {
		MessageSerialization1 messageSerialization = new MessageSerialization1();
		
		Message1 message = new Message1("MSG2","practice 2nd time same question");
		
		messageSerialization.serializeMsg(message); 
//		System.out.println(message.getMessage());
	}

}
