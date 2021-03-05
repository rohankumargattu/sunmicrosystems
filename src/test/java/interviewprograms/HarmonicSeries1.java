package interviewprograms;

import java.util.Scanner;

public class HarmonicSeries1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit");
		int n=sc.nextInt();
		double evensum=0;
		double oddsum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+1/i;
				if(i==(n) || i>=(n-1))
				{
					System.out.print("1/"+i);
				}
				else
				{
					System.out.print("1/"+i+"+");
				}
			}
		}
		System.out.print("=");
		System.out.println(evensum);
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				oddsum=oddsum+1/i;
				if(i==(n) || i>=(n-1))
				{
					System.out.print("1/"+i);
				}
				else
				{
					System.out.print("1/"+i+"+");
				}
			}
		}
		System.out.print("=");
		System.out.println(oddsum);
	}
}
