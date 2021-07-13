package src.org.deeksha.Collections;
import java.util.*;

public class LastIndexOf 
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
		 al.add("Praveen");

		 
		 System.out.println(al.lastIndexOf("Praveen")); //Index POsition  value of last one

		 System.out.println(al.indexOf("Praveen")); //Index Position value of first one

	}
}
