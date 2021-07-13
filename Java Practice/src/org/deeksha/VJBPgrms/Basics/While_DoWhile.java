package src.org.deeksha.VJBPgrms.Basics;

public class While_DoWhile 
{
	public static void main(String[] args) 
	{
		int i =10;
		
		//while
		while(i>1)
		{
			System.out.println(i);
			i--; // " i++ "; infinite loop
		}
		
		System.out.println(" ");
		//DoWhile
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<1);
		
	}
}
