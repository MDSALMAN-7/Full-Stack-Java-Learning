package com.learning.constructors3;

public class NotificationService {
	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendNotification()");
		
		if(_type.equalsIgnoreCase("sms")) {
			sendSMS();
		}
		else if(_type.equalsIgnoreCase("email")) {
			sendEmail();
		}
		else {
			sendWhatsApp();
		}
	}
	public void sendSMS() {
		System.out.println("NotificationService.sendSMS()");
	}
	public void sendEmail() {
		System.out.println("NotificationService.sendEmail()");
	}
	public void sendWhatsApp() {
		System.out.println("NotificationService.sendWhatsApp()");
	}
}
