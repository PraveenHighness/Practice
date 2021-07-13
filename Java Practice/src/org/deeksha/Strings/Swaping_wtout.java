package src.org.deeksha.Strings;

public class Swaping_wtout {
	public static void main(String[] args) {
		String s = new String("Laddu");
		String p = new String("Highness");
		
		s=s+p;
		p=s.substring(0,s.length()-p.length());
		s=s.substring(p.length());
		
		System.out.println(s);
		System.out.println(p);
	}

}
