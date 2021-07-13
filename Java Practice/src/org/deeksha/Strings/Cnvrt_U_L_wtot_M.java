package src.org.deeksha.Strings;

public class Cnvrt_U_L_wtot_M {
	public static void main(String[] args) {
		String s = new String ("HIGHNESS$69");
		char [] c = s.toCharArray();
		
		String dup = "";
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A' && c[i]<='Z')
			{
				dup =dup+(char)(c[i]+32);
			}
			else
			{
				dup=dup+c[i];
			}
		}
		System.out.println(dup);
	}

}
