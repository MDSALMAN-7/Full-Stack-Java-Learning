package com.whatsapp.read.message1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatapps.message1.Message1;

public class Driver1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(
				"E:\\Full Stack Java Learning\\Backend\\Java\\15 Serialization\\message1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Message1 message = (Message1) ois.readObject();
		
		System.out.println("De Ser:"+message.getMessage());
		
		ois.close();
		fis.close();
	}
}
