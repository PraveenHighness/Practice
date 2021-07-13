package src.org.deeksha.OOPS.Arrays;

public class Element_checking {
	public static void main(String[] args) {
		int a[] = {10,202,220,2,22};
		int elmnt =23;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]/elmnt==1)
			{
				System.out.println("Element is in the given Array");
			}
			else
				System.out.println("Not In the Array");
				break;
		}
	}

}
