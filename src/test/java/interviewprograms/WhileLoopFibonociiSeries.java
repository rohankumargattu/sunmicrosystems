package interviewprograms;

import java.util.Scanner;

public class WhileLoopFibonociiSeries 
{
	public static void main(String[] args) throws Exception
	{
		//Enter a limit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit");
		int l=sc.nextInt();
		sc.close();
		int x=0;
		int y=1;
		int z=x+y;
		System.out.print(x+" "+y+" ");
		while(z<=l)
		{
			System.out.print(z+" ");
			x=y;
			y=z;
			z=x+y;
		}
	}
}
