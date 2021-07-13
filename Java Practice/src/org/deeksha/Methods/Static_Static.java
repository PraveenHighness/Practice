package org.deeksha.Methods;

public class Static_Static {
	static int i =10;
	
	public void m1()
	{
		System.out.println(" 2 ");
	}
public static void main(String[] args) {
	System.out.println(" 1 ");
	
	Static_Static s = new Static_Static();
	s.m1();
	System.out.println(i);
	System.out.println(" 3 ");
}
	
	
}
