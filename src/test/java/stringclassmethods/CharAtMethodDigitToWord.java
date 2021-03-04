package stringclassmethods;

import java.util.Scanner;

public class CharAtMethodDigitToWord 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number as String");
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			switch(y)
			{
				case '0':
					System.out.print("Zero ");
					break;
				case '1':
					System.out.print("One ");
					break;
				case '2':
					System.out.print("Two ");
					break;
				case '3':
					System.out.print("Three ");
					break;
				case '4':
					System.out.print("Four ");
					break;
				case '5':
					System.out.print("Five ");
					break;
				case '6':
					System.out.print("Six ");
					break;
				case '7':
					System.out.print("Seven ");
					break;
				case '8':
					System.out.print("Eight ");
					break;
				case '9':
					System.out.print("Nine ");
					break;
				default:
					System.out.print("NonDigit ");
					break;		//Optional(as "default:" is last statement)
			}
		}
	}
}
