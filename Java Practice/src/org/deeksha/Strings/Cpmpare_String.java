package src.org.deeksha.Strings;

public class Cpmpare_String {
	public static void main(String[] args) {
		String s = new String ("PJS");
		String p = new String("PJS");
		
		char[] c1 = s.toCharArray();
		char[] c2 = p.toCharArray();
		
		boolean B = true;
		
		
		{
			if(c1.length != c2.length)
			{
				B=false;
				
			}
			else
			{
				for(int i=0;i<s.length();i++)
				{
					if(c1[i] != c2[i])
					{
						B=false;
						break;
					}
					else
					{
						B=true;
					}
				}
				System.out.println(B);
			}
		}
	}

}
