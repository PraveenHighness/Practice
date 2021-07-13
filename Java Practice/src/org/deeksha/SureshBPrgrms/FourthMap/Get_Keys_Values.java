package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Get_Keys_Values 
{
	public static void main(String[] args) 
	{
Map<Integer,String>  m = new LinkedHashMap<>();
		
		m.put(4, " PJS");
		m.put(6, " Highness");
		
		System.out.println(m.values());  // get values 
		System.out.println(m.keySet());  // get onlt keys
		
		System.out.println(m);    // get both keys and values
		//or
		System.out.println(m.values()+""+m.keySet());
	}
}
