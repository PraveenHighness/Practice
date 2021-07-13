package org.deeksha.flowcontrol;

public class For_trianglreverse 
{
public static void main(String[] args)
{

	int space = -1;
	int star = 6;
	
	for(int i=1;i<=5;i++)
	{
	space ++;
	star --;
	 
	for(int j=1;j<=space;j++)
	{
		System.out.print(' '+" ");
	}
	for(int k=1;k<=star;k++)
	{
		System.out.print('*'+" ");
	}
	System.out.println();

	}

}
}
