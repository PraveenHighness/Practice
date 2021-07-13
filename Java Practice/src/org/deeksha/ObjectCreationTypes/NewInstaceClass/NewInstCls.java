package src.org.deeksha.ObjectCreationTypes.NewInstaceClass;

public class NewInstCls
{
	String s = "Highness";
	public static void main(String[] args) throws InstantiationException, IllegalAccessException 
	{
		NewInstCls obj = NewInstCls.class.newInstance();
		System.out.println(obj.s);
	}
}
