package src.org.deeksha.OOPS.encapsulation8;

import src.org.deeksha.OOPS.encapsulation7.ClassSt;
import src.org.deeksha.OOPS.encapsulation7.ClassSt1;
import src.org.deeksha.OOPS.encapsulation7.ClassSt2;
import src.org.deeksha.OOPS.encapsulation7.Classprvt;

public class Classst4 extends ClassSt2 {
	public static void main(String[] args) {
		ClassSt cs = new ClassSt();
		cs.mm1();   // (we can access through import from anywhere)
		
		ClassSt1 cs1 = new ClassSt1();
		cs1.mm2();  // (default) we can't access another class from another package 
		
		ClassSt2 cs2 = new ClassSt2();
		cs2.mm3();   //( protected )we can access BCZ it is inherited 
		
		Classprvt cs3 = new Classprvt();
		cs3.mm4();   //()Since it is private method we can't access in another package.
	}

}
