package interviewprograms;

import java.util.Scanner;

public class PrimeNumbersCountUnderLimit
{
	public static void main(String[] args) throws Exception
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int l=sc.nextInt();
		sc.close();
		int count=0;
		for(int i=1;i<=l;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				count=count+1;
				System.out.println(i+" is a prime number");
			}
			else
			{
				//System.out.println(i+" is not a prime number");
			}
		}
		System.out.println("There are "+count+" prime numbers with in the limit of "+l);
	}
}
