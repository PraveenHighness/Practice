package src.org.deeksha.VJBPgrms.OOPs;

abstract class Astractcls 
{
	public void m1()
	{
		System.out.println("1");
	}
	public abstract void m2(); 
}
 class Ab extends Astractcls 
{
	public void m2()
	{
		System.out.println("2");
	}
}
