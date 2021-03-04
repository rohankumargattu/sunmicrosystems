package stringclassmethods;

import java.util.Scanner;

public class CharAtMethodWordToDigit 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number as word in initcap");
		String x=sc.nextLine();
		switch(x)
		{
			case "Zero":
				System.out.print("0");
				break;
			case "One":
				System.out.print("1");
				break;
			case "Two":
				System.out.print("2");
				break;
			case "Three":
				System.out.print("3");
				break;
			case "Four":
				System.out.print("4");
				break;
			case "Five":
				System.out.print("5");
				break;
			case "Six":
				System.out.print("6");
				break;
			case "Seven":
				System.out.print("7");
				break;
			case "Eight":
				System.out.print("8");
				break;
			case "Nine":
				System.out.print("9");
				break;
			default:
				System.out.print("NonDigit ");
				break;		//Optional(as "default:" is last statement)
		}
	}
}
