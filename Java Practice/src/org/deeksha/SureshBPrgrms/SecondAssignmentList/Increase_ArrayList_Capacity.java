package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;

public class Increase_ArrayList_Capacity
{
	public static void main(String[] args)
	{
		try {
		ArrayList<String> al = new ArrayList<>();
			al.add("PJS");
			al.add("Highness");
			al.add("PS");
			al.add("One");
			
		System.out.println(al);
		System.out.println(" ");
		
		System.out.println("Increasing ArrayListr CApacity through ensure to 1000");
		al.ensureCapacity(1000);  // Increase size tpo any length 
		
		al.trimToSize();   // Decrease Size to current capacity 
		System.out.println("Now ArrayList Size is dicreased to current capacity to iintial capacity 10");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		
		
		
	}
}
