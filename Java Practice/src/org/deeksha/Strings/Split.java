package src.org.deeksha.Strings;

public class Split {
	public static void main(String[] args) {
		
	
	String s = new String("Highness is Unique");
	String[] st = s.split(" ");
	
	for (String dupl : st)
	{
		System.out.println(dupl);
	}
	
	}
}
