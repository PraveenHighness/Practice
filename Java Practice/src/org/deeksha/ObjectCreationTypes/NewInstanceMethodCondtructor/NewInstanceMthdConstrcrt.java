package src.org.deeksha.ObjectCreationTypes.NewInstanceMethodCondtructor;

import java.lang.reflect.Constructor;

public class NewInstanceMthdConstrcrt 
{
	String s = "Highness";
	public static void main(String[] args) 
	{
		try
		{
			Constructor<NewInstanceMthdConstrcrt> obj = NewInstanceMthdConstrcrt.class.getConstructor(null);
			NewInstanceMthdConstrcrt  obj1 = obj.newInstance();
			
			System.out.println(obj1.s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

