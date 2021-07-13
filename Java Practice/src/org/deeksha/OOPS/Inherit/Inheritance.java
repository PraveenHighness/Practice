 package src.org.deeksha.OOPS.Inherit;

public class Inheritance 
{
	int i = 10;
	int j = 20;
	 static int s=69;
}

class sr extends Inheritance
{
public static void main(String[] args) {
	
	Inheritance sj = new Inheritance();
	
	System.out.println(sj.i+sj.j);
	System.out.println(s);
}	
}