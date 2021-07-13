package org.deeksha.flowcontrol;

public class Do_whilewith_If_Break_Continue {
	public static void main(String[] args) {
		int s =1;
		do {
			
			if(s==10)
			{
				s++;
				continue;
	
			}
			if(s==16)
			{
				break;
			}
			System.out.println(s);
			s++;
		}
		while(s <=20);
	}

}
