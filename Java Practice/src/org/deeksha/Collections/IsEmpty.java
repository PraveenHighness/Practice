package src.org.deeksha.Collections;
import java.util.*;

public class IsEmpty 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		
		 al.add("Shravya");
		 al.add("Manoj");
		 al.add("Vijay");
		 al.add("Suresh");
		 al.add("Praveen");
		 al.add(2,"Jyothirmayi");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		 al2.add("Tirumal");
		 al2.add("puff");
		 al2.add("potti");
		 al2.add("Hari");
		 al2.add("Swarna");
		 al2.add("Ram");
		 
		 System.out.println(al.isEmpty());
		 
		 System.out.println(al.removeAll(al));
		 
		 System.out.println(al.isEmpty());
	}
}
