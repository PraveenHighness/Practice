package src.org.deeksha.Collections;
import java.util.*;

public class Clear 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		 al.add("Shravya");
		 al.add("Manoj");
		 al.add("Vijay");
		 al.add("Suresh");
		 al.add("Praveen");
		 al.add("Jyothirmayi");
		 
		 System.out.println();
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		 al2.add("Tirumal");
		 al2.add("puff");
		 al2.add("potti");
		 al2.add("Hari");
		 al2.add("Swarna");
		 al2.add("Ram");
		 
		 al2.addAll(al);
		 al2.clear(); // clear all elements
		 //if you want to clear ant lines then place that cleat methoind in 2'nd or third line then above cleae elements are eliminaTED REMAING ARE executed;
		 
		 for(String s: al)
		 {
			 System.out.println(s);
		 }
		 System.out.println(" ");

		 for(String t: al2)
		 {
			 System.out.println(t);
		 }
	}
}
