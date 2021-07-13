package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Convert_Array_HashSet 
{
	public static void main(String[] args)
	{
		String[] s = {"P","J","S"};
		Set<String> s1 =new HashSet<>(Arrays.asList(s));
		
		System.out.println(s1);
	}
}
