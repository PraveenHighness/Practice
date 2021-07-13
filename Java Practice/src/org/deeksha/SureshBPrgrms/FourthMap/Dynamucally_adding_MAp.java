package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class Dynamucally_adding_MAp 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = scan.nextInt();
		
		Map<Integer,String> m = new HashMap(size);
		System.out.println("Enter key,value");
		
		for(int i=0; i<size; i++)
		{
			int ii = scan.nextInt();
			String s = scan.next();
			m.put(ii, s);
		}
		Set<Entry<Integer, String>> s1 = m.entrySet();
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}
}
