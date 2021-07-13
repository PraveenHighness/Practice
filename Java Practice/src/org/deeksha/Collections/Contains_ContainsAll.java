package src.org.deeksha.Collections;
import java.util.*;

public class Contains_ContainsAll 
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
		 
		 ArrayList<String> al2 = new ArrayList<String>();
			
		 al2.add("Shravya");
		 al2.add("Manoj");
		 al2.add("Vijay");
		 al2.add("Suresh");
		 al2.add("Praveen");
		 al2.add("Jyothirmayi");
		 al2.add("III");
		 
		 System.out.println(al.contains("Praveen")); // the value in the given collection 
		 
		 System.out.println(al.contains("Tom")); // there is data with name of tom in above collctoin so false
		 
		 System.out.println(al2.containsAll(al)); // is al elements are present then true
		 
		 System.out.println(al.containsAll(al2)); // is al2 elements presnt in al then true othrwise false
	
	}
}
