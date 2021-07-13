package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Compare_2HashMaps 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		
		m.put(6 , " Highness");
		m.put(4 , " PJS");
		
		Map m1 = new HashMap();
		
		m1.put(6 , " Highness");
		m1.put(4 , " PJS");
		
		System.out.println(m1.equals(m));
		
		
	}
}
