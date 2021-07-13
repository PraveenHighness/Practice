package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Get_ParticularEntry 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		
		m.put(6 , " Highness");
		m.put(4 , " PJS");
		
		System.out.println(m);
		System.out.println(m.get(6));
		System.out.println(m.getOrDefault(4, null));
	}
}
