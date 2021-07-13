package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;

public class FirstOccurance_ArrayList 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList();
			l.add(4);
			l.add(1);
			l.add(6);
			l.add(9);
			l.add(6);
			
			System.out.println(l.indexOf(6)); // FirstIndex 
			System.out.println(l.lastIndexOf(6)); // LastIndex 
			
			System.out.println(" ");
			for(Integer ii : l)
			{
				System.out.println(ii);
				break;

			}
			
/*		for (int i = 0; i < l.size(); i++)
		{
			if(l.get(i).equals(l))
			{
				System.out.println(l);
			}
			else
			{
				
				for(Integer ii :l)
				{
					System.out.println(ii);
					break;
				}
				break;
				
			}
			
*/	
			
			
	}
	
	
}
