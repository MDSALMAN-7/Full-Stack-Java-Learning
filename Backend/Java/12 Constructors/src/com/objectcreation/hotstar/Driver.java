package com.objectcreation.hotstar;

import com.objectcreation.hotstar.user.User;

public class Driver {
	public static void main(String[] args) {
		User u1 = new User("Guest", "Free");
		User u2 = new User("Guest", "Free");
		User u3 = new User("Guest", "Free");
		
		User u4 = new User("hstr2343","Kamdev rana" ,"Paid");
		User u5 = new User("hstr2443","Salman" ,"Paid");
		
		System.out.println("Total Live user are"+User.liveUserCount);
	}
}


