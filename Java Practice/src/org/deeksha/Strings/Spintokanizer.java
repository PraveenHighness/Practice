package src.org.deeksha.Strings;

import java.util.StringTokenizer;

public class Spintokanizer {
	public static void main(String[] args) {
		String s = new String("Highness Always with Positive Thinking.");
		String s1 = new String("Window");
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
		
		StringTokenizer st1 = new StringTokenizer(s1,"");
		
		while(st1.hasMoreElements())
		{
			System.out.println(st1.nextElement());
		}
		
	}

}
