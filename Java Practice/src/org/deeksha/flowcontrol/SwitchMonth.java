package org.deeksha.flowcontrol;

public class SwitchMonth {
	public static void main(String[] args) {
		int month = 4;
		String monthString="";
		
		switch(month) {
		
		case 1 : monthString="1-Jan";
		break;
		
		case 2 : monthString="2-Feb";
		break;
		
		case 3 :monthString="3-Mar";
		break;
		
		case 5 : monthString="5-Apr";
		break;
		
		case 6 : monthString="6-May";
		break;
		
		case 4 : monthString=" Sep-4";
		break;
		
		case 7 : monthString=" Leaph ";
		break;
		
		default : System.out.println("No Match");
		
		}
		}

}
