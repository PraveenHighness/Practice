package src.org.deeksha.OOPS.Inherit;

public class Inhrt2 
{
	int i;
	int j;
	 

Inhrt2(int i,int j)
{
this.i=i;
this.j=j;
}
}
class B extends Inhrt2
{
int k;
	B(int i, int j, int k) {
		super(i, j);
		this.k=k;
	}
	
}
class C extends B
{
	C(int i, int j, int k) 
	{
		super(i, j, k); 
	}


public static void main(String[] args) {
	C c =new C(6,9, 98);

	System.out.println(c.i);
	System.out.println(c.j);
	System.out.println(c.k);
}	
}

	


