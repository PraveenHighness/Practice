package src.org.deeksha.VJBPgrms.OOPs;

public class Static_Claa_Block_Method 
{
	
		static void m1()		 //Static Method
		{
			System.out.println("Method of static");
		}
		public static void main(String[] args)
		{
			m1();
			System.out.println(" ");
			//for static bock
			System.out.println(si+" & "+ss);
		}
		
		// static block
		
		static int si;  // static variables
		static String ss;
		
		// for static class
		//Static_Claa_Block_Method.mm m = new Static_Claa_Block_Method();
		//m.mm();
		
		
		static 
		{
			si = 10;
			ss = "PS";
		}
		
	/*	// static class 
		private static String str = "PJS";
		
		static class mm()
		{
			public void disp()
			{
				System.out.println(str);
			}
		}*/
		
		
	}

