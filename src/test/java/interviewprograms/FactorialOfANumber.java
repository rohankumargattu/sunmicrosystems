package interviewprograms;

import java.util.Scanner;

public class FactorialOfANumber 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int mul=1;
		for(int i=x;i>=1;i--)
		{
			mul=mul*(i);
		}
		System.out.println(mul);
	}
}
