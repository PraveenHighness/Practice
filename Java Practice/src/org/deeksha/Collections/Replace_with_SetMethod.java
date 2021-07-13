package src.org.deeksha.Collections;
import java.util.*;

public class Replace_with_SetMethod 
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
		 
		 al.set(5, "Highness");  // Replace i  particular index with new String 
		 
		 System.out.println(al);
		 
	}
}
