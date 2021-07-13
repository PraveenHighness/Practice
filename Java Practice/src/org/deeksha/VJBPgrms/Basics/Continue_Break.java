package src.org.deeksha.VJBPgrms.Basics;

public class Continue_Break 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<=9; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println(" ");
		
		for(int i=0; i<=9; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
			break;
		}
	}
}
