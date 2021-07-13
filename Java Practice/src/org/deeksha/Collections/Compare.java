package src.org.deeksha.Collections;
import java.util.*;

public class Compare 
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
		 		 
		 System.out.println(al.equals(al2)); // false bacuse there is no same data in it if index size is same but dats is different
		 
		 
		 ArrayList<String> al3 = new ArrayList<String>();
			
		 al3.add("Shravya");
		 al3.add("Manoj");
		 al3.add("Vijay");
		 al3.add("Suresh");
		 al3.add("Praveen");
		 al3.add(2,"Jyothirmayi");
		
		ArrayList<String> al4 = new ArrayList<String>();
		
		 al4.add("Shravya");
		 al4.add("Manoj");
		 al4.add("Vijay");
		 al4.add("Suresh");
		 al4.add("Praveen");
		 al4.add(2,"Jyothirmayi");
		 
		 
		 System.out.println(al3.equals(al4)); // data is same & in case one index is not match or not same index then it false
		 
		 System.out.println(al4.get(5)); // particular index elemnt

	}
}
