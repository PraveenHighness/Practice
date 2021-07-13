package src.org.deeksha.Collections;
import java.util.*;


public class Iterator_hasNext_Next_hasPrevoius_previous
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Shravya");
		al.add("Manoj");
		al.add("Vijay");
		al.add("Suresh");
		al.add("Praveen");
		
		ListIterator<String> alitr = al.listIterator(); // list the values in same datatype
//		Iterator alitr = new iterator();  for all datatypes of values;
//		 while condtion &o/p for iterator
		
		System.out.println("Forword : ");
		System.out.println(" ");
		while(alitr.hasNext())
		{
			System.out.println(alitr.next());
		}
		System.out.println(" ");

		System.out.println("Reverse : ");
		System.out.println(" ");

		while(alitr.hasPrevious())
		{
			System.out.println(alitr.previous());

		}
		
		al.forEach(a->{System.out.println(a);}); // o/p with forEach 
	}
}
