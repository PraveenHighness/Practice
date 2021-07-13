package src.org.deeksha.Collections;
import java.util.*;

public class Sorting 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		
		 al.add("Shravya");
		 al.add("Manoj");
		 al.add("Vijay");
		 al.add("Suresh");
		 al.add("Praveen");
		 al.add("jyothirmai");
		 
		 al.sort(String.CASE_INSENSITIVE_ORDER); // Alphabetical order Upper/Lower Case is not checking
		 
		 System.out.println(al);
		 
		 al.sort(Comparator.naturalOrder());  // 1'st upper then lower case 
		 
		 System.out.println(al);
	}
}
