package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;

public class Copy_OneToAnotherArrayList 
{
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(1);
			
		List<Integer> al2 = new ArrayList<Integer>(al);
		
		al2.add(6);
		al2.add(9);
		
		Collections.copy(al2, al); // if position changed it doesn't work (Child,Super) 
		System.out.println(al2);
		
		for(Integer i : al2)
		{
			System.out.println(i);
		}
	}
}
