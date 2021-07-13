package src.org.deeksha.VJBPgrms.Basics;

public class If_Else 
{
	public static void main(String[] args) 
	{
		int i =10;
		
		//if
		if(i<50)
		{
			System.out.println("i is lessthgan 50");
		}
		
		System.out.println(" ");
		
		//nested if 
		if(i<20)
		{
			System.out.println("i is less than 40");
			if(i > 5)
			{
				System.out.println("i is greterthan 5");
			}
		}
		System.out.println(" ");
		
		//if-else
		if(i>30)
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("i is lessthan 30");
		}
		System.out.println(" ");
		
		
		// if-else-if
		int n = 1000;
		
		if(n <100 && n >=1)
		{
			System.out.println("n is biiger");
		}
		else if (n <999 && n >=1000 )
		{
			System.out.println("Checking no.");
		}
		else
		{
			System.out.println("Crown");
		}
	}
}
