package src.org.deeksha.VJBPgrms.OOPs;

public class Inheritance 
{
	String s = "PJS";
	String SS = "PJH";
	
	void m1()
	{
		System.out.println("Method CAllling in chaild class ");
	}
	
	public static class Inherit2 extends Inheritance
	{
		String ss1 = "PS";
		public static void main(String[] args) 
		{
			Inherit2 i = new Inherit2();
			
			System.out.println(i.s);
			System.out.println(i.SS);
			System.out.println(i.ss1);
			i.m1();
		}
	}
}
