package src.org.deeksha.Strings;

public class String_Char_Length {
	public static void main(String[] args) {
	
		String H = "sssenhgiH";
		int leng=0;
	char[] c = {'L','a','d','d','u'};
	String s =new String(c);
	
	System.out.println(s);
	System.out.println(s.length());
	
	
	char [] ch =H.toCharArray();
	String rev="";
	for(int i=H.length()-1;i>0;i--)
	{
		rev=rev+ch[i];
	}
	System.out.println(rev);
	for(char cc:ch)
	{
		leng++;
	}
	System.out.println(leng);
	}
}
