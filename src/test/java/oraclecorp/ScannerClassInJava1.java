package oraclecorp;

import java.util.Scanner;

public class ScannerClassInJava1 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		String temp=sc.nextLine();
		char c=temp.charAt(0);		//0 index indicates 1st character in the String
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("Enter a int number");
		int x=sc.nextInt();
		System.out.println("Enter a long number");
		long y=sc.nextLong();
		System.out.println("Enter a float number");
		float z=sc.nextFloat();
		System.out.println("Enter a double number");
		double w=sc.nextDouble();
		System.out.println("Enter a boolean");
		boolean b=sc.nextBoolean();
		sc.close();	//Optional statement(To save memory by killing object after its usage)
		
		//Outputs
		System.out.println("Given char value is "+c);
		System.out.println("Given String value is "+s);
		System.out.println("Given int value is "+x);
		System.out.println("Given long value is "+y);
		System.out.println("Given float value is "+z);
		System.out.println("Given double value is "+w);
		System.out.println("Given boolean value is "+b);
	}
}
