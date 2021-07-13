package src.org.deeksha.Strings;

public class Repeat_with_no_ {
	public static void main(String[] args) {
		String s = new String("MadaM");
		char ch ='M';
		int n =8;
		String dup ="";
		
		char[] chh = s.toCharArray();
		for(int i=0;i<chh.length;i++)
		{
			if (chh[i] == ch)
			{
			dup=dup+n;
			}
			else
			{
				dup=dup+chh[i];
			}
		}
		System.out.println(dup);
	}

}
