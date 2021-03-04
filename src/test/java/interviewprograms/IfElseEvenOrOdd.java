package interviewprograms;

import java.util.Scanner;

public class IfElseEvenOrOdd
{
	public static void main(String[] args) throws Exception
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be checked for even/odd");
		int x=sc.nextInt();
		sc.close();
		//Check for even or odd
		if(x%2==0)
		{
			System.out.println(x+" is even");
		}
		else
		{
			System.out.println(x+" is odd");
		}
	}
}
