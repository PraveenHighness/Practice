package src.org.deeksha.Strings;

public class Polyndrome {
	public static void main(String[] args) {
		String s = new  String("Highness");
		char[] ch = s.toCharArray();
		
		String reverse ="";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse+ch[i];
		}
		if(s.equals(reverse))
		{
			System.out.println("Polindrome");
		}
		else
		{
			System.out.println("Not a Polindrome");
		}
	}

}
