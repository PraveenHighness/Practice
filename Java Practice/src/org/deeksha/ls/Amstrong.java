package com.ls;

public class Amstrong {
		public static void main(String[] args) {
			int i = 153;
			int temp = i;
			int x = 0;
			int s;
			while (temp > 0) {
				s = temp % 10;

				x = x + s*s*s;
				temp=temp/10;
			}
			if (i == x)
				System.out.print("Amstrong");

			else
				System.out.println("Not Amstrong");
		
	}

}
 