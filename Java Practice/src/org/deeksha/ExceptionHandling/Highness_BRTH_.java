package src.org.deeksha.ExceptionHandling;

import java.util.Scanner;

public class Highness_BRTH_ 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			TimeE e=new TimeE(06,9,1998, 04,01,4);
			System.out.println(e);
			 
			System.out.println("to change Date & Time :");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter day");
			int day = sc.nextInt();
			System.out.println("enter month");
			int month = sc.nextInt();
			System.out.println("enter year");
			int year = sc.nextInt();
			
			System.out.println("enter hour");
			int hour = sc.nextInt();
			System.out.println("enter minut");
			int minut =sc.nextInt();
			System.out.println("enter seconds");
			int seconds = sc.nextInt();
			
			try
			{
				e.changeTime(day,month,year, hour,minut,seconds);
				System.out.println("Change Date & Time : "+e );
				break;
			}
			catch(Customeside_Exception ce1)
			{
				System.out.println("ivalid Date & Time");
				System.out.println("re-enter Day & time");
				
				System.out.println("enter day");
				day = sc.nextInt();
				System.out.println("enter month");
				month = sc.nextInt();
				System.out.println("enter year");
				year = sc.nextInt();
				
				System.out.println("enter hour");
				hour = sc.nextInt();
				System.out.println("enter minut");
				minut = sc.nextInt();
				System.out.println("enter seconds");
				seconds = sc.nextInt();
				
				System.out.println("Changed Date & Time :"+e);
			}
		}
	}
}
