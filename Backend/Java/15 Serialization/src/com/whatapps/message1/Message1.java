package com.whatapps.message1;

import java.io.Serializable;

public class Message1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String messageId;
	private transient String message;
	 
	
	public Message1(String messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}
	
	// setter and getter
	
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
