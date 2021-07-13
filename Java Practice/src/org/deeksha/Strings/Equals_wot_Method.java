package src.org.deeksha.Strings;

public class Equals_wot_Method {
	public static void main(String[] args) {
		
	
	String s1 = new String("Highness");
	String s2 = new String("HighneSS");
	
	String s3 = s1.toUpperCase();
	String s4 = s2.toUpperCase();
	
	String s5 = s1.toLowerCase();
	String s6 = s2.toLowerCase();
	
	
	char[] ch1 = s3.toCharArray();
	char[] ch2 = s4.toCharArray();
	
	char[] ch3 = s5.toCharArray();
	char[] ch4 = s6.toCharArray();
	
	boolean b = true;
	boolean b1 = true;
	
	if(ch1.length != ch2.length)
	{
		b=false;
	}
	else 
	{
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i] != ch2[i])
			{
				b=false;
				break;
			}
		}
		if(b)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("Not Match");
		}
	}
	
	
	
	
	
	if (ch3.length != ch4.length)
	{
		b1=false;
	}
	else
	{
		for(int j=0;j<ch3.length;j++)
		{
			if(ch3[j] != ch4[j])
			{
				b1=false;
				break;
			}
		}
		if(b1)
		{
			
			System.out.println(b1);
		}
		else
		{
			System.out.println("Not");
		}
	}

  }
}
