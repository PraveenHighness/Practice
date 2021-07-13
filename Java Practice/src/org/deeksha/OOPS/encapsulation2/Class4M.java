package src.org.deeksha.OOPS.encapsulation2;

import src.org.deeksha.OOPS.encapsulation1.Class1;
import src.org.deeksha.OOPS.encapsulation1.Class2;
import src.org.deeksha.OOPS.encapsulation1.Class3;

public class Class4M {
	public static void main(String[] args) {
		Class1 c1 = new Class1();
			c1.m1();
			
		Class2 c2 = new Class2();
			c2.m2();
		
		Class3 c3 = new Class3();
			c3.m3();
		System.out.println(c3.i);
			
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
