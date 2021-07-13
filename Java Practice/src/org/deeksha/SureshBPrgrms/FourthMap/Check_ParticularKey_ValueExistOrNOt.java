package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Check_ParticularKey_ValueExistOrNOt 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		
		m.put(6 , "Highness");
		m.put(4 , "PJS");
		
		System.out.println(m.containsKey(6));  // key exist or not with contains
		System.out.println(m.containsValue("Highness"));
	}
}
