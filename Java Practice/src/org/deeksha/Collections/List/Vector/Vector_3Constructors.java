package src.org.deeksha.Collections.List.Vector;
import java.util.*;

public class Vector_3Constructors 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		System.out.println(v.capacity()); // capcity of vection 10 is intial value\
		
		for (int i =1; i<=10; i++)
		{
			v.addElement(i);
			System.out.print(i+" ");
		}
		System.out.println(v.capacity());
		v.add("Highness"); // adding 11'th element
		System.out.println(v.capacity()); // then capacity is incresed double 
		
		System.out.println(v);
		System.out.println(" ");
		
		
		
		
		
		
		Vector v1 = new Vector(25); // intial capacity of v1 is 25 
		
		System.out.println(v1.capacity()); 
		
		for (int i =1; i<=10; i++)
		{
			v.addElement(i);
			System.out.print(i+" ");
		}
		System.out.println(v1.capacity());
		v1.add("Highness");
		System.out.println(v1.capacity()); 
		
		System.out.println(v1);
		System.out.println(" ");
		
		
		
		Vector v2 = new Vector(10,5);
		
		System.out.println(v2.capacity()); 
		
		for (int i =1; i<=10; i++)
		{
			v2.addElement(i);
			System.out.print(i+" ");
		}
		System.out.println(v.capacity());
		v2.add("Highness"); 
		System.out.println(v2.capacity()); 
		
		System.out.println(v2);
		
		
 	}
}
