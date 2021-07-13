package src.org.deeksha.Collections;
import java.util.*;

public class Add1_similar_datatype 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("PJS");
		al.add("Highness");
		
		System.out.println(al);
	
		
		for(String s : al) //foreach loop
		{
			System.out.println(al);
			break;
		}
		
		
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		
		for(int i=0; i<al.size(); i++)      // for loop
		{
			//System.out.println(i); // for size of index elements for string & int
			
			System.out.println(al.get(i)); // to get exact output
		}
		
		al.forEach(a->{System.out.println(a);}); // o/p with forEach 
			
	}
}
