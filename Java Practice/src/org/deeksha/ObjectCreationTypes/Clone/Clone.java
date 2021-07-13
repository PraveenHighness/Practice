package src.org.deeksha.ObjectCreationTypes.Clone;

public class Clone  implements Cloneable
{
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();		
	}
	String s = "Highness";
	public static void main(String[] args) 
	{
		Clone obj = new Clone();
		
		try
		{
			Clone obj1 = (Clone)obj.clone();
			System.out.println(obj.s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
