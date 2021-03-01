package loopsinjava;

import java.util.Scanner;

public class WhileLoopReverseNumber
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		int x=sc.nextInt();
		sc.close();
		int y=0;
		while(x!=0)		//x>0
		{
			int d=x%10;
			y=y*10+d;
			x=(int) x/10;
		}
		System.out.println("Reversed number is "+y);
	}
}
