package src.org.deeksha.VJBPgrms.OOPs;

public class SuperClass 
{
	
	void display()
	{
		System.out.println("PS");
	}
}
class Subclass extends SuperClass
{
	void print()
	{
		System.out.println("SS");
		display();
	}
	public static void main(String[] args) 
	{
		Subclass s = new Subclass();
		s.print();
	}
	
}

