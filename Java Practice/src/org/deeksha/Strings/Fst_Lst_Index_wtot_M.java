package src.org.deeksha.Strings;

public class Fst_Lst_Index_wtot_M {
	public static void main(String[] args) {
		String s = new String("Highness");
		char c = 's';
		
		int index =0;
		char[] ch = s.toCharArray();
		
		for(int i=0;i<=ch.length;i++)
		{
			if(ch[i]==c)
			{
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
