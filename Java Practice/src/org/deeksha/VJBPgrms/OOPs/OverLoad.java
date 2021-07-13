package src.org.deeksha.VJBPgrms.OOPs;

public class OverLoad
{
	void m(int a)
	{
		System.out.println(a);
	}
	
	void m(int a ,int b)
	{
		System.out.println(a+"-"+b);
	}
	
	String m(String s)
	{
		return s;
		
	}
	
	double m1(double b)
	{
		return b*b;
		
	}

	public double m(double b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
