package src.org.deeksha.VJBPgrms.OOPs;

public abstract class Interface 
{
	public abstract void m1();
	public abstract void m2();
	
}
abstract class Bb extends Interface
{
	public void m1()
	{
		System.out.println("Abstract");
	}

}
class Cc extends Bb
{
	public void m2()
	{
		System.out.print("inherit");
	}
}
