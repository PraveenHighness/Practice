package src.org.deeksha.Strings;

public class Cnvr_L_U_wtohut_Method {
	public static void main(String[] args) {
		String s = "Highness$69";
		char[] ch = s.toCharArray();
		String dup ="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				dup=dup+(char)(ch[i]-32);
			}
			else 
			{
				dup =dup+ch[i];
			}
		}
		System.out.println(dup);
	}

}
