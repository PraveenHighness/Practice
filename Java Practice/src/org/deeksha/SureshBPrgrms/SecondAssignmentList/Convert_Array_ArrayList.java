package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;

public class Convert_Array_ArrayList 
{
	public static void main(String[] args) 
	{
		int[] i = {6,9,98,4,1,94};  // Array
		
	List<Integer> i2 = new ArrayList<Integer>(i.length);
	for( int il : i)
	{
		System.out.println(il);
	}
			
		//String 
		
		String[] s = {"PJS","Java","VTech"};
		
		List<String> l = Arrays.asList(s);
		//System.out.println(l);    // Array Formation Outcome
		
		for(String ss : l)
		{
			System.out.println(ss);
		}
		
	}
}
