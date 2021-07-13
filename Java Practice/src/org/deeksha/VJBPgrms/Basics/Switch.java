package src.org.deeksha.VJBPgrms.Basics;

public class Switch
{
	public static void main(String[] args) 
	{
		int i =10;
		
		switch( i+2 )
		{
		case 1:
			System.out.println("1 :"+i);
			
		case 2:
			System.out.println("2 :"+i);
			
		case 3:
			System.out.println("3 :"+i);
			
		default :
			System.out.println("D : " + i);
		}
	}
}
