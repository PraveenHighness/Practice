package org.deeksha.flowcontrol;

import java.util.Scanner;

public class Ifelse
{
	public static void main(String[] args)
	{
		int marks ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		marks = scan.nextInt();
		
		if (marks >= 80)
		{
			System.out.println("First Grade");
			}
		else if  (marks >= 70)
			System.out.println("Second Grade");
		else if (marks >= 35)
			System.out.println("Least Grade");
		   
		else {
			System.out.println("Fail");
				
		}
		
	}

}
