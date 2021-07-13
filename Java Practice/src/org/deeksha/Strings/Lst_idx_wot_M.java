package src.org.deeksha.Strings;

public class Lst_idx_wot_M {
	public static void main(String[] args) {
		String s1 = new String("Highness");
		char c = 'h';
		
		int index =0;
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]==c)
			{
				index=i;
			}
		}
		System.out.println(index);
	}

}
