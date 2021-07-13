package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Add_Nulls_TRee_Hash_Map 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();   // HashMap
		
		m.put(6 , " Highness");
		m.put(4 , " PJS");
		
		m.put(null, null);
		m.put(null, " QUN");
		m.put(null, "PS");
		
		System.out.println(m);
		
		
		Map m1 = new TreeMap();  // TreeMap
		
		m1.put(6 , " Highness");
		m1.put(4 , " PJS");
		
		m1.put(null, " m");
	
		
		System.out.println(m1);
	}
}
