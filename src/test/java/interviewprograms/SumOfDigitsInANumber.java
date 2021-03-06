package interviewprograms;

import java.util.Scanner;

public class SumOfDigitsInANumber
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		//Addition of digits
		int temp11=num;
		int temp21=0;
		while(temp11!=0)
		{
			temp21=temp21+temp11%10;
			temp11=(int)temp11/10;
		}
		System.out.println(temp21);
		
		//Addition of digits until single digit
		int temp12=num;
		int temp22=0;
		while(temp12!=0)
		{
			temp22=temp22+temp12%10;
			temp12=(int)temp12/10;
			if(temp12==0 && temp22>9)
			{
				temp12=temp22;
				temp22=0;
			}
		}
		System.out.println(temp22);
	}
}
