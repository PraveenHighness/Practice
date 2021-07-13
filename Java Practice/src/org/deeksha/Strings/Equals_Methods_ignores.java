package src.org.deeksha.Strings;

public class Equals_Methods_ignores {
	public static void main(String[] args) {
		String s1 = new String("PJS");
		String s2 = new String("PJS");
		
		String s3 = new String("PJs");
		String s4 = new String("pjS");
		
		
		boolean b = s1.contentEquals(s2);
		
			if (b)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal ");
			}
			
		boolean b1 = s3.equalsIgnoreCase(s4);
			
			if(b1)
			{
				System.out.println("Eqls");
			}
			else
			{
				System.out.println("Nt Eqls");
			}
	}
}
