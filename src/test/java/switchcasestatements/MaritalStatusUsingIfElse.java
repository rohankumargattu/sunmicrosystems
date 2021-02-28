package switchcasestatements;

import java.util.Scanner;

public class MaritalStatusUsingIfElse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter y or n");
		String s=sc.nextLine();
		char c=s.charAt(0);
		if(c=='y')
		{
			System.out.println("married");
		}
		else if(c=='n')
		{
			System.out.println("unmarried");
		}
		else
		{
			System.out.println("please provide y or n");
		}
	}
}
