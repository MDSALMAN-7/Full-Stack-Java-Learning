package com.whatsapp.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatapps.message.Message;

public class Driver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(
				"E:\\Full Stack Java Learning\\Backend\\Java\\15 Serialization\\message.ser");
 
		ObjectInputStream ois = new ObjectInputStream(fis);

		Message message = (Message) ois.readObject(); // here (Message) is downCasting

		System.out.println("De Ser: " + message.getMessage()+" and User Id "+message.getUserID());

		fis.close();
		ois.close();
	}
}
