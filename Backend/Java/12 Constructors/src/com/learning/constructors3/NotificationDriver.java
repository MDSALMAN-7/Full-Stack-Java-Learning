package com.learning.constructors3;

public class NotificationDriver {
	public static void main(String[] args) {
		NotificationService ns = new NotificationService();
		
		ns.sendNotification("sms");
		ns.sendNotification("email");
		ns.sendNotification("other");
	}
}
