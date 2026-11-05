package com.whatapps.message;

import java.io.Serializable;

public class Message implements Serializable {
	//private static final long serialVersionUID = 1L;  // is a unique ID given by JVM to the class
													 // in de-serialized this line will play the role
													// if not write this line JVM will generate Internally
	private String messageId;
	private String message;
	private transient String userID;
	
	public Message(String messageId, String message, String userID ) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.userID = userID;
	}
	
	// Setter and getter
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	// Getter of message
	public String GetMessageId() {
		return messageId;
	}
	
	public void setmessageId(String messageId) {
		this.messageId = messageId;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	
}
