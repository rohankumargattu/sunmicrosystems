package switchcasestatements;

import java.util.Scanner;

public class DigitsToWords
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String l=sc.nextLine();
		for(int i=0;i<l.length();i++)
		{
			char x=l.charAt(i);
			switch(x)
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
					System.out.print("Invalid");
					break;		//Optional(as "default:" is last statement)
			}
		}
	}
}
