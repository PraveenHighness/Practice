package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Remove_Particular_Element 
{
	public static void main(String[] args) 
	{
Map m = new HashMap();
		
		m.put(6 , " Highness");
		m.put(4 , " PJS");
		m.put(0, "m");
		
		System.out.println(m.remove(0, "m"));
		System.out.println(m);
	}
}
