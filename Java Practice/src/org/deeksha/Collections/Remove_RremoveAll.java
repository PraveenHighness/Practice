package src.org.deeksha.Collections;
import java.util.*;
import java.util.function.Predicate;

public class Remove_RremoveAll 
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
		 al2.remove(3);		  // remove particu index valuue 

		 
		 
		 
		 System.out.println(al2.remove(2)); // remove particula element with index in object
		 
		 System.out.println(al2);
		 
		 System.out.println(al.removeAll(al)); // remove object
		 
		 System.out.println(al);
		 
		ArrayList<Integer> al3 = new ArrayList<Integer>();

		 
		 al3.add(10);
		 al3.add(20);
		 al3.add(30);
		 al3.add(40);
		 al3.add(50);
		 al3.add(77);
		 
		 al3.removeIf( z-> (z>20) ); // this is removeIf method assign a variable and then start with Lambda expression (z-> (Condition)); 
		 //this condition remove all after condiotn;
		 
		 System.out.println(al3);
		 
		 
	}
}
