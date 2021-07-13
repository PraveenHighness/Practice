package src.org.deeksha.VJBPgrms.OOPs;

public class Constructor 
{
	String s;
	
	Constructor()     // Constructor &  that too without arg;
	{
		this.s= "Highness";
	}
	public static void main(String[] args)
	{
		Constructor c =new Constructor();
		System.out.println(c.s);
		
		//for arg
		
		Constructor cc = new Constructor(6,"Hgnes");
		Constructor cc2 = new Constructor(4,"PJS");
			System.out.println(cc);        
			System.out.println(cc2);  	// 
		
	}
	
	int id;
	String ss;
	
	Constructor(int id,String ss)    // Con with args; and Constructor over loading & over riding
	{
		this.id = id;
		this.ss = ss;
		
	}
	void info()
	{
		System.out.println(id+ss);
		
	}
	
	
	
}
