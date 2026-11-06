package com.whatapps.message1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization1 {
	public void serializeMsg(Message1 message1) throws IOException {
		
		FileOutputStream fio = new FileOutputStream("message1.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fio);
		
		oos.writeObject(message1); // writing
		
		fio.close();
		oos.close(); // close the connection
		System.out.println("Successfully...");
		System.out.println("Run Serialized file");
	}
}
