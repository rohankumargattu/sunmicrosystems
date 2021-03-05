package interviewprograms;

import java.util.Scanner;

public class MathematicalTables
{
	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number for mulplication table");
		//int x=sc.nextInt();
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(""+i+"*"+j+"="+(i*j));
			}
		}
		
	}
}
