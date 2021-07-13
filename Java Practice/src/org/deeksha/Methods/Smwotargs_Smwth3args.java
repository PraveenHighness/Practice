package org.deeksha.Methods;

public class Smwotargs_Smwth3args {
	public static void m1()
		{
			System.out.println("g");
		}
	public void m2()
	{
		System.out.println("m");
	}
	public static void m3(int i,double d,boolean b)
	{
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
	}
	public static void main(String[] args) {
		m1();
		m3(10,0.2,true);
		Smwotargs_Smwth3args s = new Smwotargs_Smwth3args();
		s.m2();
	}
}
