package src.org.deeksha.VJBPgrms.Basics;

public class Operators
{
	public static void main(String[] args) 
	{
	
	int i =100;
	int ii =20;
	
	//Arthematic
	
	System.out.println("Add :"+ (i+ii) );
	System.out.println("Sub :"+(i-ii) );
	System.out.println("Mul :"+ (i*ii) );
	System.out.println("Divd :"+ (i/ii) );	
	System.out.println("Perc :"+ (i%ii) );
	
	System.out.println(" ");
	
	//Assignment
	
	i=ii;											//equal
	System.out.println("Eqal :" +i );
	
	i += ii;										//plus
	System.out.println("Plus :" +ii);
	
	
	i -= ii;
	System.out.println("Sub :"+ ii);
	
	i *= ii;
	System.out.println("Mul :"+ ii);
	
	i /= ii;
	System.out.println("Div :"+ ii);
	
	
	i %= ii;
	System.out.println("Per :"+ ii);
	
	System.out.println(" ");
	
	
	// Incremenr Decrement
	i++;
	ii--;
	System.out.println("Incre :"+ i);
	System.out.println("Decre :"+ ii);
	
	System.out.println(" ");
	
	//Logical 
	boolean b1 = true;
	boolean b2 = false;
	
	System.out.println(b1 && b2);  // and
	System.out.println(b1 || b2);  //or
	System.out.println(!(b1 && b2)); //nand
	System.out.println(!(b1 || b2 )); //nor
	
	System.out.println(" ");
	
	//Rational
	
	
	if(i == ii)
	{
		System.out.println("Eqal");
	}
	else 
	{
		System.out.println("Not Equal");
	}
	
	if(i != ii)
	{
		System.out.println("Not Eqal");
	}
	else 
	{
		System.out.println(" Equal");
	}

	if(i > ii)
	{
		System.out.println("Greater");
	}
	else 
	{
		System.out.println("LEsser");
	}
	
	if(i < ii)
	{
		System.out.println("Lesser");
	}
	else 
	{
		System.out.println("greater");
	}

	if(i >= ii)
	{
		System.out.println("Greater Eqal");
	}
	else 
	{
		System.out.println("Not ");
	}
	
	if(i <= ii)
	{
		System.out.println("Lesser Eqal");
	}
	else 
	{
		System.out.println("Not ");
	}
	
	System.out.println(" ");
	
	
	// bitwise
	
	int dup;
	dup = i & ii;
	System.out.println(dup);
	
	dup= i | ii;
	System.out.println(dup);
	
	dup = i^ii;
	System.out.println(dup);
	
	dup = -i;
	System.out.println(dup);
	
	dup = ii << i;
	System.out.println(dup);
	
	dup = i >> ii;
	System.out.println(dup);
	
	System.out.println(" ");
	
	
	
	//terinary
	i = (ii == 10) ? 10:20;
	System.out.println(i);

	ii = (i == 20) ?  20:10;
	System.out.println(ii);


	}
			
}
