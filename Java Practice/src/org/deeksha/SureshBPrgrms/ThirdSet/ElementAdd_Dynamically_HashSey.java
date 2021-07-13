package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;


public class ElementAdd_Dynamically_HashSey 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of Elemnts :");
		int size = scanner.nextInt();
		
		Set<Integer> s = new HashSet<>();
		System.out.println("Enter HashSet Elements");
		
		for( int i=0; i<size; i++)
		{
			int elements = scanner.nextInt();
			s.add(elements);
		}
		s.add(6);
		s.add(4);
		System.out.println("Print HAshSet Elements");
		
		for(int i=0; i<s.size(); i++)
		{
			System.out.println(s);
		}
	}
}
