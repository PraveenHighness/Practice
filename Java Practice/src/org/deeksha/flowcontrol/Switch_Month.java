package org.deeksha.flowcontrol;
public class Switch_Month {
		public static void main(String[] args) {
			int month = 8;
			String monthString="";
			
			switch(month) {
			
			case 1 : monthString="1-Jan";
			break;
			
			case 2 : monthString="2-Feb";
			break;
			
			case 3 :monthString="3-Mar";
			break;
			
			case 4 : System.out.println(monthString="6-Sep");
			break;
			
			case 5 : monthString="4-Apr";
			break;
			
			case 6 : monthString="6-May";
			break;
			
			case 7 : monthString=" Leaph ";
			break;
			
			default : System.out.println("No Match");
			
			}
			//System.out.println(monthString);
		}

	}
