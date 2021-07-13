package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;
public class Campare2ArrayList 
{
	public static void main(String[] args)
	{
		
	ArrayList<String> al = new ArrayList<>();
		al.add("PJS");
		al.add("Highness");
		al.add("PS");
		
	ArrayList<String> al2 = new ArrayList<>();
		al2.add("PJS");
		al2.add("Highness");
		al2.add("PS");
	
		//al2.add("N A");
		
	System.out.println(al.equals(al2));
	}
}
