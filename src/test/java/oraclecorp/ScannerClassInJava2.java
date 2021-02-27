package oraclecorp;

import java.util.Scanner;

public class ScannerClassInJava2 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int x=Integer.parseInt(sc.nextLine());
		System.out.println("Enter a String");
		String s=sc.nextLine();
		sc.close();	//Optional statement(To save memory by killing object after its usage)
		
		//Outputs
		System.out.println("Given int value is "+x);
		System.out.println("Given String value is "+s);	
	}
}
