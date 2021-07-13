package src.org.deeksha.OOPS.Inherit;

public class Multilevel 
{
	int s ;
	int r;
	int j;
	

Multilevel(int s, int r)
{
	this.s=s;
	this.r=r;
}
}
class srj extends Multilevel
{
	srj(int s,int r,int j)
	{
	super(s,r);
	this.j=j;
	}
}
class H extends srj
{
H(int s, int r, int j) {
		super(s, r, j);
		
	}

public static void main(String[] args)
{
H c = new H(6, 9, 98);
System.out.println(c.s +" "+c.r+" "+c.j);

}
}