package src.org.deeksha.Collections;
import java.util.*;

public class AddAll_InSpecif_index
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		 al.add("Shravya");
		 al.add("Manoj");
		 al.add("Vijay");
		 al.add("Suresh");
		 al.add("Praveen");
		 al.add("Jyothirmayi");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		 al2.add("Tirumal");
		 al2.add("puff");
		 al2.add("potti");
		 al2.add("Hari");
		 al2.add("Swarna");
		 al2.add("Ram");
		 
		 al2.addAll(1,al); // for add all elements first al into seconnd al2 index  in second indexplace
		 
		 for(String s: al)
		 {
			 System.out.println(s);
		 }
		 System.out.println(" ");

		 for(String t: al2)
		 {
			 System.out.println(t);
		 }
	}
}
