package src.org.deeksha.Collections;
import java.util.*;

public class RetainAll 
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
		
		 al2.add("Shravya");
		 al2.add("Manoj");
		 al2.add("Vijay");
		 al2.add("Praveen");
		 al2.add("Swarna");
		 al2.add("Ram");
		 
		 al2.retainAll(al);
		 
		 System.out.println(al2); // it will retun the common data in comlared colection and delate remining data from the collectrion 
		 
	}
}
