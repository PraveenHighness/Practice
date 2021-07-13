package src.org.deeksha.VJBPgrms.OOPs;
 
public class OverRiding
{
	public void eat()
	{
		System.out.println("H");
	}
}
class Over extends OverRiding
{
	public void eat()
	{
		System.out.println("HH");
	}
	public static void main(String[] args)
	{
		Over v = new Over();
		v.eat();
		System.out.println(v);
	}
}