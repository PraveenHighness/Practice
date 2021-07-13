package src.org.deeksha.Collections;
import java.util.*;

public class Sublist 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();

		
		 al.add("Shravya");
		 al.add("Manoj");
		 al.add("Vijay");
		 al.add("Praveen");
		 al.add("Suresh");
		 al.add("jyothirmai");
		 
		 System.out.println(al.subList(0, 4));
	}
}
