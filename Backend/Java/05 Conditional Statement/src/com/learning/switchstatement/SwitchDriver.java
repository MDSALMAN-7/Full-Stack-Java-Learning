package com.learning.switchstatement;

public class SwitchDriver {
	public static void main(String[] args) {
		SwitchDriver sd = new SwitchDriver();
		
		int day = Integer.parseInt(args[0]); // command line input and parsing it
		
		sd.identifyDay(day);

	}

	public void identifyDay(int number) {
		switch (number) {
		case 1:
			System.err.println("mon");
			break;
		case 2:
			System.err.println("tue");
			break;
		case 3:
			System.err.println("wed");
			break;
		case 4:
			System.err.println("thu");
			break;
		case 5:
			System.err.println("fri");
			break;
		case 6:
			System.err.println("sat");
			break;
		case 7:
			System.err.println("sun");
			break;
		default:
			System.err.println("invald day!");
			break;
		}
	}
}

