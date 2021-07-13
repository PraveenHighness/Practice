package src.org.deeksha.VJBPgrms.OOPs;

public class MethodOverLoading 
{
	public static void main(String[] args) 
	{
		OverLoad ps = new OverLoad();
		double result = 6.4;
		ps.m(8);
		ps.m(6,9);
		
		
		System.out.println(result);
		System.out.println(ps.m("Vj-Tech"));
	}
}
  