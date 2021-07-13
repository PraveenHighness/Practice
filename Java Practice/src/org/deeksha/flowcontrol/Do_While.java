package org.deeksha.flowcontrol;

public class Do_While {
 public static void main(String[] args) {
	int i=1;
	
	do {
		

		if(i==6)
		{
			i++;
		continue;
		}
		if(i==9) {
			break;
		}
		System.out.println(i);
		i++;
	    
}	while(i<=10);
}
}
