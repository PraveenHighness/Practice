package src.org.deeksha.Strings;

public class Find_Index_wiout {
	public static void main(String[] args) {
		String s = new String ("Highness");
		
		int index = 3;
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(i == index)
			{
				System.out.println(ch[i]);
			}
		}
		
		System.out.println(s.indexOf('n'));
		
		System.out.println(s.lastIndexOf('s'));
		}

}
