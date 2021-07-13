package src.org.deeksha.OOPS.Abstract;

public abstract class AbInherit 
{
	public abstract void m1();
	public abstract void m2();
	
}
abstract class Bb extends AbInherit
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
