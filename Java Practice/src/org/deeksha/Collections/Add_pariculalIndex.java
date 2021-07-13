package src.org.deeksha.Collections;

import java.util.ArrayList;

public class Add_pariculalIndex 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Shravya");
		al.add("Manoj");
		al.add("Vijay");
		al.add("Suresh");
		al.add("Praveen");
		al.add(3, "Jyothirmayi");
		
		System.out.println(al);
	}
}
