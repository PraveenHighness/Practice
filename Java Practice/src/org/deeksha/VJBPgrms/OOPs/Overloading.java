package src.org.deeksha.VJBPgrms.OOPs;

public class Overloading 
{
	public static void main(String[] args)
	{
		Overloading  d = new Overloading();
		d.disp('p');
		d.disp('S', 6);
	}
	public void disp(char c)
	{
		System.out.println(c);
	}
	public void disp(char c,int n)
	{
		System.out.println(c + " "+ n);
	}
class Sample
{
	
}
}
