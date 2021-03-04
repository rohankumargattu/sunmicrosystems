package stringclassmethods;

import java.util.Scanner;

public class CompareToMethod 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String x=sc.nextLine();
		System.out.println("Enter 2nd String");
		String y=sc.nextLine();
		//To check which string is bigger by considering case
		int z=x.compareTo(y);
		if(z==0)
		{
			System.out.println("Both Strings are same");
		}
		else if(z>0)
		{
			System.out.println(x+" is BIGGER than "+y);
		}
		else
		{
			System.out.println(x+" is SMALLER than "+y);
		}
	}
}
