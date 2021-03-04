package oraclecorp;

import java.util.Scanner;

public class ExceptionHandlingThrow 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter voter age");
		int x=sc.nextInt();
		sc.close();
		try
		{
			if(x>18)
			{
				System.out.println("Valid to vote");
			}
			else
			{
				ArithmeticException obj=new ArithmeticException("Invalid to vote");
				throw obj;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
