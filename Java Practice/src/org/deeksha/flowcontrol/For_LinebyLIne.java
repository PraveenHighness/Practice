package org.deeksha.flowcontrol;

public class For_LinebyLIne {
public static void main(String[] args) {
	for(int i=1;i<=8;i++) {
		for(int j=1;j<=5;j++) {
			if((i==2) || (i==4) || (i==6)) {
				System.out.print('@');
			}
			else {
				System.out.print('*');
			}
		}
			System.out.println();
		
	}
		
}
}
