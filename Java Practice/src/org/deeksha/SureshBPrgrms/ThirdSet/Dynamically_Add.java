package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Dynamically_Add 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = scanner.nextInt();
		System.out.println("Enter Elements");
		
		Set<String> s = new HashSet<>(size);
		for(int i=0; i<size; i++)
		{
			String s1 = scanner.next();
			s.add(s1);
		}
		s.add("Highness");
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
